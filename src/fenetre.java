import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.util.LinkedList;
import java.util.List;
import java.util.Random;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class fenetre extends JFrame implements ObservateurButton{
	
	private Menu menu = new Menu();
	private Grid grid = new Grid(menu);
	

	public fenetre(){
		this.setTitle("Animation");
	    this.setSize(450, 300);
	    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    this.setLocationRelativeTo(null);
	    this.setLayout(new BorderLayout());
	    
	    this.add(menu, BorderLayout.SOUTH);
	    menu.getButton().setObservateur(this);
	    
	    this.add(grid, BorderLayout.CENTER);
	    
	    this.setVisible(true);
	}


	public Menu getMenu() {
		return menu;
	}


	@Override
	public void actualiser(ObservableButton o) {
		// TODO Auto-generated method stub
		this.remove(grid);
		grid = new Grid(menu);
		this.add(grid, BorderLayout.CENTER);
		menu.reset();
		this.setVisible(true);
	}
	
	


	
}
