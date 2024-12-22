import java.awt.Color;

import javax.swing.JFrame;


public class Form extends JFrame {
	public Form(String title) {
		//sets title
		super(title);
		
		setSize(720,720); //sets size
		setDefaultCloseOperation(EXIT_ON_CLOSE); //exits GUI when x is pressed
		setLayout(null); //makes it so we can manually position components
		
		//load GUI in the center
		setLocationRelativeTo(null);//opens in the middle of the screen
		setResizable(false); //does not allow a person to edit the size of GUI
		getContentPane().setBackground(Color.BLACK);
		
	}
}
