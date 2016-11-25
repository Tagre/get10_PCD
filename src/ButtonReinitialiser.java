import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;

public class ButtonReinitialiser extends JButton implements ActionListener,ObservableButton{
	ObservateurButton observateur;
	
	public ButtonReinitialiser() {
		super();
		this.setText("Reinitialiser");
    	addActionListener(this);
		
	}
	
	public ButtonReinitialiser(ObservateurButton o) {
		super();
		this.setText("Reinitialiser");
		this.setObservateur(o);
    	addActionListener(this);
		
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		notifierObservateur(observateur);
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
