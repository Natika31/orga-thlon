package Kanban;
import javax.swing.JPanel;
import javax.swing.table.AbstractTableModel;

public class TabKanbanModele extends AbstractTableModel {
	
	private String titresColonnes [] = {"A FAIRE", "EN COURS", "TERMINE", "EN ATTENTE"}; //chaque colonne est associée ą l'état d'une tache
	private JPanel nombreTableauKanbanComposantTāches [][] = { 
				
						{new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche(""), new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche ("")},
						{new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche(""), new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche ("")},
						{new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche(""), new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche ("")},
						{new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche(""), new TableauKanbanComposantTāche (""), new TableauKanbanComposantTāche ("")},
	};
	@Override
	public int getColumnCount() {
		return this.titresColonnes.length;
	}

	@Override
	public int getRowCount() {
		return this.nombreTableauKanbanComposantTāches.length;
	}

	@Override
	public Object getValueAt(int row, int col) {
		return this.nombreTableauKanbanComposantTāches[row][col];
	}
	
	public Class getColumnClass(int col) {
		return getValueAt(0,col).getClass();
	}
	
	 public String getColumnName(int col) {
	    	return this.titresColonnes[col];
	 }
	 
	 public boolean isCellEditable(int row, int col) {
		    return true;
     }
	 
	 public void setValueAt(JPanel value, int row, int col) {
	    	this.nombreTableauKanbanComposantTāches[row][col] = value;
	        fireTableCellUpdated(row, col);
	    }

}
