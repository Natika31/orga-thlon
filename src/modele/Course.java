package modele;

import java.time.LocalDate;
import java.util.Calendar;

import modele.contacts.Contact;

public class Course {
	
	private String nom_course;
	private String format;
	private LocalDate date_debut_course;
	private LocalDate date_fin_course ;
	private String description_course;
	private int nbParticipants;
	private String parcours;
	private float budget;
	private String type_epreuve;
	private int duree;
	private boolean agrement;
	private String nom_ville_nat ;
	private String nom_ville_cyc ;
	private String nom_ville_cou ;
	private String nom_ville_arr ;
	private String CP_ville_nat ;
	private String CP_ville_cyc ;
	private String CP_ville_cou ;
	private String CP_ville_arr ;
	private int distance_nat ;
	private int distance_cyc ;
	private int distance_cou ;
	private int id_course ;
	Calendar calendar = Calendar.getInstance();
	private String AuteurCourse;
	
	public Course (String nom) {
		this.nom_course = nom;
	}
	
	public String getAuteurCourse() {
		return this.AuteurCourse;
		
	}
	
	public String getNom()  {
		return this.nom_course;
	}

	public void setNom(String nom) {
		this.nom_course = nom;
	}

	public String getFormat() {
		return format;
	}

	public void setFormat(String format) {
		this.format = format;
	}
	

	public String getDescriptionCourse() {
		return description_course;
	}

	public void setDescriptionCourse(String descriptionCourse) {
		this.description_course = descriptionCourse;
	}

	public int getNbParticipants() {
		return nbParticipants;
	}

	public void setNbParticipants(int nbParticipants) {
		this.nbParticipants = nbParticipants;
	}

	public String getParcours() {
		return parcours;
	}

	public void setParcours(String parcours) {
		this.parcours = parcours;
	}

	public float getBudget() {
		return budget;
	}

	public void setBudget(float budget) {
		this.budget = budget;
	}


	public String getType_epreuve() {
		return type_epreuve;
	}

	public void setType_epreuve(String type_epreuve) {
		this.type_epreuve = type_epreuve;
	}

	public int getDuree() {
		return duree;
	}

	public void setDuree(int duree) {
		this.duree = duree;
	}

	public boolean isAgrement() {
		return agrement;
	}

	public void setAgrement(boolean agrement) {
		this.agrement = agrement;
	}
	
	public void affecter(Tache t, Contact c) {
		
	}
	
	public Course getCourse() {
		return this ;
	}

	public String getNom_ville_nat() {
		return nom_ville_nat;
	}

	public void setNom_ville_nat(String nom_ville_nat) {
		this.nom_ville_nat = nom_ville_nat;
	}

	public String getNom_ville_cyc() {
		return nom_ville_cyc;
	}

	public void setNom_ville_cyc(String nom_ville_cyc) {
		this.nom_ville_cyc = nom_ville_cyc;
	}

	public String getNom_ville_cou() {
		return nom_ville_cou;
	}

	public void setNom_ville_cou(String nom_ville_cou) {
		this.nom_ville_cou = nom_ville_cou;
	}

	public String getNom_ville_arr() {
		return nom_ville_arr;
	}

	public void setNom_ville_arr(String nom_ville_arr) {
		this.nom_ville_arr = nom_ville_arr;
	}

	public String getCP_ville_nat() {
		return CP_ville_nat;
	}

	public void setCP_ville_nat(String cP_ville_nat) {
		CP_ville_nat = cP_ville_nat;
	}

	public String getCP_ville_cyc() {
		return CP_ville_cyc;
	}

	public void setCP_ville_cyc(String cP_ville_cyc) {
		CP_ville_cyc = cP_ville_cyc;
	}

	public String getCP_ville_cou() {
		return CP_ville_cou;
	}

	public void setCP_ville_cou(String cP_ville_cou) {
		CP_ville_cou = cP_ville_cou;
	}

	public String getCP_ville_arr() {
		return CP_ville_arr;
	}

	public void setCP_ville_arr(String cP_ville_arr) {
		CP_ville_arr = cP_ville_arr;
	}

	public int getDistance_nat() {
		return distance_nat;
	}

	public void setDistance_nat(int distance_nat) {
		this.distance_nat = distance_nat;
	}

	public int getDistance_cyc() {
		return distance_cyc;
	}

	public void setDistance_cyc(int distance_cyc) {
		this.distance_cyc = distance_cyc;
	}

	public int getDistance_cou() {
		return distance_cou;
	}

	public void setDistance_cou(int distance_cou) {
		this.distance_cou = distance_cou;
	}

	public int getId_course() {
		return id_course;
	}
	
	public void setId_Course(int id) {
		this.id_course = id;
	}
	
	public LocalDate getDate_debut_course() {
		return date_debut_course;
	}

	public void setDate_debut_course(LocalDate d1) {
		this.date_debut_course = d1;
	}

	public LocalDate getDate_fin_course() {
		return date_fin_course;
	}

	public void setDate_fin_course(LocalDate d2) {
		this.date_fin_course = d2;
	}
}
