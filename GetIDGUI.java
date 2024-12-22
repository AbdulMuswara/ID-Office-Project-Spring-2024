import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.border.BevelBorder;

public class GetIDGUI extends JFrame{
	public GetIDGUI() { 
		super("Student ID");
		setSize(385,100); //sets size
		setDefaultCloseOperation(EXIT_ON_CLOSE); //exits GUI when x is pressed
		setLayout(null); //makes it so we can manually position components
		
		//load GUI in the center
		setLocationRelativeTo(null);//opens in the middle of the screen
		setResizable(false); //does not allow a person to edit the size of GUI
		getContentPane().setBackground(Color.BLACK);
		addGUIComponents();
	}

	private void addGUIComponents() {
		JLabel enterID = new JLabel("Enter ID:");
		enterID.setBounds(10, 20, 125, 30);
		enterID.setForeground(new Color(34, 240, 34));
		enterID.setFont(new Font("Dialog", Font.BOLD, 20));
		
		JTextField studentIDTextField = new JTextField();
		studentIDTextField.setBounds(100, 20, 150, 30);
		studentIDTextField.setForeground(new Color(34, 240, 34));
		studentIDTextField.setBackground(new Color(32, 32, 32));
		studentIDTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		studentIDTextField.setHorizontalAlignment(JTextField.CENTER);
		studentIDTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		studentIDTextField.setCaretColor(Color.GREEN);
		
		add(enterID);
		add(studentIDTextField);
		
		JButton submitID = new JButton("Submit");
		submitID.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		submitID.setFocusPainted(false);
		submitID.setForeground(new Color(34, 240, 34));
		submitID.setFont(new Font("Dialog", Font.BOLD, 18));
		submitID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//makes hand cursor when hovering
		submitID.setBackground(new Color(16, 16, 16));
		submitID.setBounds(260, 20, 100, 30);
		submitID.addActionListener(e -> {
			
			//changes will be made here for be made for error checking
			//need to validate their input in order to edit
			//for now takes input and uses it for edit student id
			String studentID = studentIDTextField.getText();
			edit_StudentIDGUI editStudentGUI = new edit_StudentIDGUI(studentID);
			editStudentGUI.setVisible(true);
            this.dispose();
            
        });
		
		add(submitID);
	}
}
