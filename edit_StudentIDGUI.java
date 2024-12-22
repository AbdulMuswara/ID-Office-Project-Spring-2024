import java.awt.Color;
import java.awt.Cursor;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.border.BevelBorder;

public class edit_StudentIDGUI extends Form{
	public String studentID = ""; //used to show which student we are editing
	
	public edit_StudentIDGUI(String id) {
		super("Edit Student ID");
		addGUIComponents(id);
		
	}
	public void setStudentID(String studentID) {
        this.studentID = studentID;
    }

	private void addGUIComponents(String id) {
		//////////////////
		JLabel idText = new JLabel("Student ID: " + id);
		idText.setBounds(10, 10, 200, 100);
		idText.setForeground(new Color(34, 240, 34));//greenish color
		idText.setFont(new Font("Dialog", Font.BOLD, 20));
		//idText.setHorizontalAlignment(SwingConstants.LEFT);
		add(idText);
		
		//header label
		JLabel headerText = new JLabel("Administration");
		headerText.setBounds(200, 50, 300, 100);
		headerText.setForeground(new Color(34, 240, 34));//greenish color
		headerText.setFont(new Font("Dialog", Font.BOLD, 40));
		headerText.setHorizontalAlignment(SwingConstants.CENTER);
		add(headerText);
		
		
		//first name label
		JLabel firstName = new JLabel("First Name:");
		firstName.setBounds(60, 150, 125, 30);
		firstName.setForeground(new Color(34, 240, 34));
		firstName.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		//first name textfield to input first name
		JTextField firstNameTextField = new JTextField();
		firstNameTextField.setBounds(185, 150, 150, 30);
		firstNameTextField.setForeground(new Color(34, 240, 34));
		firstNameTextField.setBackground(new Color(32, 32, 32));
		firstNameTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		firstNameTextField.setHorizontalAlignment(JTextField.CENTER);
		firstNameTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		firstNameTextField.setCaretColor(Color.GREEN);
		
		//adds first name label and textfield
		add(firstName);
		add(firstNameTextField);
		
		//middle initial label and test field
		//same codes but different location as above
		JLabel middleInitial = new JLabel("Middle Initial:");
		middleInitial.setBounds(60, 200, 125, 30);
		middleInitial.setForeground(new Color(34, 240, 34));
		middleInitial.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField middleInitialTextField = new JTextField();
		middleInitialTextField.setBounds(185, 200, 150, 30);
		middleInitialTextField.setForeground(new Color(34, 240, 34));
		middleInitialTextField.setBackground(new Color(32, 32, 32));
		middleInitialTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		middleInitialTextField.setHorizontalAlignment(JTextField.CENTER);
		middleInitialTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		middleInitialTextField.setCaretColor(Color.GREEN);
		
			
		add(middleInitial);
		add(middleInitialTextField);
		
		JLabel lastName = new JLabel("Last Name:");
		lastName.setBounds(60, 250, 125, 30);
		lastName.setForeground(new Color(34, 240, 34));
		lastName.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField lastNameTextField = new JTextField();
		lastNameTextField.setBounds(185, 250, 150, 30);
		lastNameTextField.setForeground(new Color(34, 240, 34));
		lastNameTextField.setBackground(new Color(32, 32, 32));
		lastNameTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		lastNameTextField.setHorizontalAlignment(JTextField.CENTER);
		lastNameTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		lastNameTextField.setCaretColor(Color.GREEN);
		
			
		add(lastName);
		add(lastNameTextField);
		
		JLabel dob = new JLabel("Date of Birth:");
		dob.setBounds(60, 300, 125, 30);
		dob.setForeground(new Color(34, 240, 34));
		dob.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField dobTextField = new JTextField();
		dobTextField.setBounds(185, 300, 150, 30);
		dobTextField.setForeground(new Color(34, 240, 34));
		dobTextField.setBackground(new Color(32, 32, 32));
		dobTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		dobTextField.setHorizontalAlignment(JTextField.CENTER);
		dobTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		dobTextField.setCaretColor(Color.GREEN);
		
		
		add(dob);
		add(dobTextField);
		
		JLabel studentYear = new JLabel("Student Year:");
		studentYear.setBounds(350, 150, 125, 30);
		studentYear.setForeground(new Color(34, 240, 34));
		studentYear.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField studentYearTextField = new JTextField();
		studentYearTextField.setBounds(490, 150, 150, 30);
		studentYearTextField.setForeground(new Color(34, 240, 34));
		studentYearTextField.setBackground(new Color(32, 32, 32));
		studentYearTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		studentYearTextField.setHorizontalAlignment(JTextField.CENTER);
		studentYearTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		studentYearTextField.setCaretColor(Color.GREEN);
		
		add(studentYear);
		add(studentYearTextField);
		
		JLabel studentEmail = new JLabel("Student Email:");
		studentEmail.setBounds(350, 200, 150, 30);
		studentEmail.setForeground(new Color(34, 240, 34));
		studentEmail.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField studentEmailTextField = new JTextField();
		studentEmailTextField.setBounds(490, 200, 150, 30);
		studentEmailTextField.setForeground(new Color(34, 240, 34));
		studentEmailTextField.setBackground(new Color(32, 32, 32));
		studentEmailTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		studentEmailTextField.setHorizontalAlignment(JTextField.CENTER);
		studentEmailTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		studentEmailTextField.setCaretColor(Color.GREEN);
		
		add(studentEmail);
		add(studentEmailTextField);
		
		JLabel addressLabel = new JLabel("Address:");
		addressLabel.setBounds(350, 250, 150, 30);
		addressLabel.setForeground(new Color(34, 240, 34));
		addressLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		
		JTextArea addressTextField = new JTextArea();
		JScrollPane scrollPane = new JScrollPane(addressTextField); 
		//addressTextField.setBounds(490, 250, 100, 30);
		scrollPane.setBounds(490, 250, 150, 30);
		addressTextField.setLineWrap(true);
		addressTextField.setWrapStyleWord(true);
		addressTextField.setForeground(new Color(34, 240, 34));
		addressTextField.setBackground(new Color(32, 32, 32));
		addressTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		addressTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		addressTextField.setCaretColor(Color.GREEN);
		
		add(addressLabel);	
		add(scrollPane);
		
		
		JLabel phoneNumberLabel = new JLabel("Phone Number:");
		phoneNumberLabel.setBounds(350, 300, 150, 30);
		phoneNumberLabel.setForeground(new Color(34, 240, 34));
		phoneNumberLabel.setFont(new Font("Dialog", Font.PLAIN, 20));
		
		JTextField phoneNumberTextField = new JTextField();
		phoneNumberTextField.setBounds(490, 300, 150, 30);
		phoneNumberTextField.setForeground(new Color(34, 240, 34));
		phoneNumberTextField.setBackground(new Color(32, 32, 32));
		phoneNumberTextField.setFont(new Font("Dialog", Font.PLAIN, 20));
		phoneNumberTextField.setHorizontalAlignment(JTextField.CENTER);
		phoneNumberTextField.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		phoneNumberTextField.setCaretColor(Color.GREEN);
		
		add(phoneNumberLabel);
		add(phoneNumberTextField);
		
		//add student button
		JButton editStudent = new JButton("Edit Student ID");
		editStudent.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		editStudent.setFocusPainted(false);
		editStudent.setForeground(new Color(34, 240, 34));
		editStudent.setFont(new Font("Dialog", Font.BOLD, 18));
		editStudent.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//makes hand cursor when hovering
		editStudent.setBackground(new Color(16, 16, 16));
		editStudent.setBounds(250, 400, 175, 40);

		editStudent.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// Get information
				String First = firstNameTextField.getText();
				String Middle = middleInitialTextField.getText();
				String Last = lastNameTextField.getText();
				String DOB = dobTextField.getText();
				String Year = studentYearTextField.getText();
				String Email = studentEmailTextField.getText();
				String Address = addressTextField.getText();
				String Phone = phoneNumberTextField.getText();
				String EMPLID = id;

				// Validate User Input
				if (validateUserInput(First, Last, DOB, EMPLID)) {
					// Edits Student's info to the database
					if (MyJDBC.edit(First, Middle, Last, DOB, Year, Email, Address, Phone, EMPLID)) {
						// Disposes edit_Student GUI
						edit_StudentIDGUI.this.dispose();
						// Takes back to main page
						ID_MainGUI idMainGUI = new ID_MainGUI();
						idMainGUI.setVisible(true);
						// Creates a result dialog
						JOptionPane.showMessageDialog(idMainGUI, "Changes Successfully Made");
					} else {
						// Removes this gui and takes back to main page with fail dialog
						edit_StudentIDGUI.this.dispose();

						ID_MainGUI idMainGUI = new ID_MainGUI();
						idMainGUI.setVisible(true);
						JOptionPane.showMessageDialog(edit_StudentIDGUI.this, "Failed Edit: ID Does Not Exist");
					}
				} else {
					// Removes this gui and takes back to main page with invalid input dialog
					edit_StudentIDGUI.this.dispose();

					ID_MainGUI idMainGUI = new ID_MainGUI();
					idMainGUI.setVisible(true);
					JOptionPane.showMessageDialog(edit_StudentIDGUI.this, "Invalid Input");
				}
			}

		});
		
		add(editStudent);
		
	}

	// Checks if input is valid
	private boolean validateUserInput(String First, String Last, String DOB, String EMPLID) {
		if (First.isEmpty() || Last.isEmpty() || DOB.isEmpty() || EMPLID.isEmpty()) {
			return false;
		}
		return true;
	}

}
