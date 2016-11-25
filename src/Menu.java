import javax.swing.JPanel;
import javax.swing.JTextField;

public class Menu extends JPanel implements ObservateurButton {
//classe utilisée pour construire le menu en bas de la fenetre du jeu
	JTextField text= new JTextField();
	ButtonReinitialiser button=new ButtonReinitialiser();
	int compteur=0;
	
	public Menu() {
		super();
		text.setText("Nombre de clic : "+compteur);
		this.add(text);
		this.add(button);
	}

	@Override
	public void actualiser(ObservableButton o) {
		// TODO Auto-generated method stub
		compteur++;
		text.setText("Nombre de clic : "+compteur);
		
	}

	public ButtonReinitialiser getButton() {
		return button;
	}
	
	public void reset(){
		compteur=0;
		text.setText("Nombre de clic : "+compteur);
	}
	
	
}
