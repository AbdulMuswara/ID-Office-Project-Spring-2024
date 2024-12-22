import java.awt.Color;
import java.awt.Cursor;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.ArrayList;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import java.sql.*;

public class ID_MainGUI extends Form {

	public ID_MainGUI() {
		super("ID Generator");
		addGUIComponents();
	}

	private void addGUIComponents() {
		//this will be used later to print id
		//currently it is not visible
		JFrame studentListFrame = new JFrame("Student List");
        studentListFrame.getContentPane().setBackground(Color.BLACK);     
        studentListFrame.setSize(800, 400);
        studentListFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // Close only this frame when closed
        studentListFrame.setLocationRelativeTo(this); // Center the frame relative to the main frame
        studentListFrame.setLayout(new FlowLayout());
        
		//header label
		JLabel headerText = new JLabel("ID Administration System");
		headerText.setBounds(100, 100, 500, 100);
		headerText.setForeground(new Color(34, 240, 34));//greenish color
		headerText.setFont(new Font("Dialog", Font.BOLD, 40));
		headerText.setHorizontalAlignment(SwingConstants.CENTER);
		add(headerText);
		
		//java allows use of html code
		//here it simply underlines the label
		JLabel adminText = new JLabel("<html><u>Administrator</u></html>");
		adminText.setBounds(150, 200, 150, 100);
		adminText.setForeground(new Color(34, 240, 34));
		adminText.setFont(new Font("Dialog", Font.PLAIN, 20));
		add(adminText);
		
		//samething for the ID Office as above
		JLabel idOffice = new JLabel("<html><u>ID Office</u></html>");
		idOffice.setBounds(450, 200, 150, 100);
		idOffice.setForeground(new Color(34, 240, 34));
		idOffice.setFont(new Font("Dialog", Font.PLAIN, 20));
		add(idOffice);
		
		//left buttons
		JButton addID = new JButton("Add Student ID");
		addID.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		addID.setFocusPainted(false);
		addID.setForeground(new Color(34, 240, 34));
		addID.setFont(new Font("Dialog", Font.BOLD, 18));
		addID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//makes hand cursor when hovering
		addID.setBackground(new Color(16, 16, 16));
		addID.setBounds(100, 300, 200, 50);
		addID.addActionListener(e -> {
            new add_StudentIDGUI().setVisible(true);
            setVisible(false);
        });
		add(addID);
		
		JButton editID = new JButton("Edit Student ID");
		editID.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		editID.setFocusPainted(false);
		editID.setForeground(new Color(34, 240, 34));
		editID.setFont(new Font("Dialog", Font.BOLD, 18));
		editID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//makes hand cursor when hovering
		editID.setBackground(new Color(16, 16, 16));
		editID.setBounds(100, 375, 200, 50);
		editID.addActionListener(e -> {
			//opens the place to input ID
			new GetIDGUI().setVisible(true);
            this.dispose();
            
        });
		add(editID);
		
		
		//this is for when a button is pressed and released
		//text color changes
		addID.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	                //changes text color to see better
	            	addID.setForeground(Color.BLACK);
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {         
	            	//changes text color back to normal
	            	addID.setForeground(new Color(34, 240, 34));
	            }
	        });
		editID.addMouseListener(new MouseAdapter() {
	            @Override
	            public void mousePressed(MouseEvent e) {
	            	//changes text color
	            	editID.setForeground(Color.BLACK);
	            }

	            @Override
	            public void mouseReleased(MouseEvent e) {
	            	//changes text color back
	            	editID.setForeground(new Color(34, 240, 34));
	            }
	        });
		
		
		
		//right button
		JButton printID = new JButton("Print Student ID");
		printID.setBorder(BorderFactory.createBevelBorder(BevelBorder.RAISED));
		printID.setFocusPainted(false);
		printID.setForeground(new Color(34, 240, 34));
		printID.setFont(new Font("Dialog", Font.BOLD, 18));
		printID.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));//makes hand cursor when hovering
		printID.setBackground(new Color(16, 16, 16));
		printID.setBounds(400, 300, 200, 50);
		printID.addActionListener(e -> {
            
            this.dispose();//closes current GUI (ID_MainGUI)
            
            //array list of students that contains their name and phone number and emplid
            ArrayList<Student> students = retrieveStudentData();
            
            //iterates through each student and creates a button for each of them into studentListFrame
            for (Student student : students) {
                JButton button = new JButton(student.getFirstName() + " " + student.getMiddle() + ". "
                		+ student.getLastName() + " " + student.getPhone()); // Display student name on button
                button.setBackground(new Color(34, 240, 34));
                button.setForeground(new Color(32, 32, 32));
                
                button.addActionListener(e2 -> {
                	//when anyone of the student buttons are pressed, opens their ID
                	new IDGUI(student.getFirstName() + " " + student.getMiddle() + ". "
                    		+ student.getLastName(), student.getID()).setVisible(true);
                });
                studentListFrame.add(button);
            }
            
            studentListFrame.setVisible(true);
   
        });
		add(printID);
		
		printID.addMouseListener(new MouseAdapter() {
            @Override
            public void mousePressed(MouseEvent e) {
            	//changes text color
            	printID.setForeground(Color.BLACK);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
            	//changes text color back
            	printID.setForeground(new Color(34, 240, 34));
            }
        });
	
		
	}
	//gets first name, middle initial, last name and phone number for all student that exists
	private ArrayList<Student> retrieveStudentData() {
		ArrayList<Student> students = new ArrayList<>();
        // Your code to retrieve student data from the database goes here
        // Example:
        try {
            Connection connection = DriverManager.getConnection(MyJDBC.DB_URL, MyJDBC.DB_USERNAME, MyJDBC.DB_PASSWORD);
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM students");
            while (resultSet.next()) {
                String studentFirstName = resultSet.getString("First"); // 
                String studentMiddle = resultSet.getString("Middle");
                String studentLastName = resultSet.getString("Last");
                String studentPhoneNum = resultSet.getString("Phone");
                String studentID = resultSet.getString("EMPLID");
                
                students.add(new Student(studentFirstName, studentMiddle, studentLastName, studentPhoneNum, studentID));
            }
            connection.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return students;
    }
	
	
	
	}


