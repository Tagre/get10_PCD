import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class Button extends JButton implements ActionListener,ObservableButton{
	int etiquette;
	ObservateurButton observateur;
	
	public Button(){
		super();
		Random rand = new Random();
		etiquette = rand.nextInt(4)+1; //Entre 0 et 4
		this.setText(""+etiquette);
    	addActionListener(this);
		
	}
	
	public Button(ObservateurButton o){
		super();
		Random rand = new Random();
		etiquette = rand.nextInt(4)+1; //Entre 0 et 4
		this.setText(""+etiquette);
		this.setObservateur(o);
    	addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println(""+etiquette);
		notifierObservateur(observateur);
		majCouleur();
		
	}
	
	public void majCouleur(){
		switch(etiquette){
		case 1: this.setBackground(Color.red);break;
		case 2: this.setBackground(Color.green);break;
		case 3: this.setBackground(Color.pink);break;
		case 4: this.setBackground(Color.black);break;
		case 5: this.setBackground(Color.blue);break;
		case 6: this.setBackground(Color.blue);break;
		case 7: this.setBackground(Color.blue);break;
		case 8: this.setBackground(Color.blue);break;
		case 9: this.setBackground(Color.blue);break;
		case 10: this.setBackground(Color.blue);break;
		}
	}

	@Override
	public void setObservateur(ObservateurButton o) {
		// TODO Auto-generated method stub
		this.observateur=o;
		
	}

	@Override
	public void notifierObservateur(ObservateurButton o) {
		// TODO Auto-generated method stub
		o.actualiser(this);
		
	}

}
