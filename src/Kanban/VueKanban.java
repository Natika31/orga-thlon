package Kanban;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class VueKanban extends JPanel {
	private JPanel pAfaire;
	private JPanel pEnCours;
	private JPanel pEnAttente;
	private JPanel pTermine;
	private Map<String, LinkedList<VueCarte>> cartes;
	////private List<VueCarte> cartesRecurrentes;
	private LinkedList<VueCarte> cartesAfaire;
	private LinkedList<VueCarte> cartesEnCours;
	private LinkedList<VueCarte> cartesTerminees;
	private LinkedList<VueCarte> cartesSuspendues;
	
	public VueKanban(Map<String, LinkedList<VueCarte>> cartes){
		this.setLayout(new BorderLayout());
		JPanel ptitres = new JPanel();
		ptitres.setLayout(new GridLayout(1,4));
		ptitres.add(new JLabel("A FAIRE", JLabel.CENTER));
		ptitres.add(new JLabel("EN COURS", JLabel.CENTER));
		ptitres.add(new JLabel("TERMINE", JLabel.CENTER));
		ptitres.add(new JLabel("EN ATTENTE", JLabel.CENTER));

		JPanel pCartes = new JPanel();
		pCartes.setLayout(new GridLayout(1,4));
		this.add(ptitres, BorderLayout.NORTH);
		this.add(pCartes);
		this.cartes = cartes;
		
		this.pAfaire = new JPanel();
		pAfaire.setBackground(Color.white);
		pAfaire.setBorder(new EmptyBorder(20,20,20,20));		
		for (VueCarte carteAFaire : this.cartes.get("aFaire")) {
			pAfaire.add(carteAFaire);
		}
		pCartes.add(pAfaire);
		
		this.pEnCours = new JPanel();
		pEnCours.setBackground(Color.LIGHT_GRAY);
		for (VueCarte carteEnCours : this.cartes.get("enCours")) {
			pEnCours.add(carteEnCours);
		}
		pEnCours.setBorder(new EmptyBorder(20,20,20,20));		
		pCartes.add(pEnCours);
		
		this.pTermine = new JPanel();
		pTermine.setBackground(Color.gray);
		for (VueCarte carteTerminees : this.cartes.get("Terminees")) {
			pTermine.add(carteTerminees);
		}
		pTermine.setBorder(new EmptyBorder(20,20,20,20));	
		pCartes.add(pTermine);
		
		this.pEnAttente = new JPanel();
		pEnAttente.setBackground(Color.LIGHT_GRAY);
		for (VueCarte carteEnAttente : this.cartes.get("enAttente")) {
			pEnAttente.add(carteEnAttente);
		}
		pEnAttente.setBorder(new EmptyBorder(20,20,20,20));
		pCartes.add(pEnAttente);
		
	}

	public void afficherNouvelEtatCarte(VueCarte carte, EtatCartes ancienEtat, EtatCartes nouvelEtat) {
		switch(nouvelEtat) {
		case A_FAIRE:
			System.out.println("Vuekanban : etat A_FAIRE");

			if(ancienEtat.equals(EtatCartes.EN_COURS)) {
				pEnCours.remove(carte);
			}
			pAfaire.add(carte);
			break;
		case EN_COURS:
			System.out.println("Vuekanban : etat EN_COURS");

			if (ancienEtat.equals(EtatCartes.EN_ATTENTE)) {
				pEnAttente.remove(carte);
			}
			if (ancienEtat.equals(EtatCartes.A_FAIRE)) {
				pAfaire.remove(carte);
			}
			pEnCours.add(carte);
			break;
		case EN_ATTENTE:
			System.out.println("Vuekanban : etat EN_ATTENTE");

			pEnAttente.add(carte);
			pEnCours.remove(carte);
			break;
		case TERMINEE:
			System.out.println("Vuekanban : etat TERMINEE");

			pEnCours.remove(carte);
			pTermine.add(carte);
			break;
		case SUPPRIME:
			System.out.println("Vuekanban : etat SUPPRIME");

			if (ancienEtat.equals(EtatCartes.EN_COURS)) {
				pEnCours.remove(carte);
			}
			if (ancienEtat.equals(EtatCartes.A_FAIRE)) {
				pAfaire.remove(carte);
			}
			if (ancienEtat.equals(EtatCartes.EN_ATTENTE)) {
				pEnAttente.remove(carte);
			}
			if (ancienEtat.equals(EtatCartes.TERMINEE)) {
				pTermine.remove(carte);
			}		
		}
	}

	

}