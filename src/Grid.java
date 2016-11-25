import java.awt.GridLayout;
import java.util.LinkedList;
import javax.swing.JPanel;

public class Grid extends JPanel{
//classe utilisé pour construire la grille centrale
	LinkedList<Button> liste= new LinkedList<Button>();
	GridLayout g=new GridLayout(5, 5);
	
	public Grid() {
		super();
		//On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(g);
	    
	    for (int j=0;j<25;j++){
	    	liste.add(new Button());
	    	this.add(liste.get(j));
	    }
	}
	
	public Grid(ObservateurButton o) {
		super();
		//On définit le layout à utiliser sur le content pane
	    //Trois lignes sur deux colonnes
	    this.setLayout(g);
	    
	    for (int j=0;j<25;j++){
	    	liste.add(new Button(o));
	    	this.add(liste.get(j));
	    }
	}
	
	
	

}
