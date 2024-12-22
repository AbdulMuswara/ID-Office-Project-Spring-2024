import java.awt.Color;
import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;

public class IDGUI extends JFrame {

	public IDGUI(String studentName, String id) {
		super("Student ID");
		setSize(300,200); //sets size
		setDefaultCloseOperation(DISPOSE_ON_CLOSE); //exits GUI when x is pressed
		setLayout(null);
		setLocationRelativeTo(null);
		
		JLabel left = new JLabel();
		JLabel right = new JLabel();
		JLabel bottomLeft = new JLabel();
		JLabel name = new JLabel(studentName);
		JLabel EMPLID = new JLabel(id);
		JLabel spring = new JLabel("SPRING 2024 UNDERGRAD");
		
		name.setForeground(Color.WHITE); // Set text color to white
        name.setFont(new Font("Dialog", Font.PLAIN, 12)); // Set font and size
        name.setHorizontalAlignment(SwingConstants.LEFT); // Center align text
        name.setBounds(0, 0, 210, 20);
        
        // Add image to a JLabel in the left panel
        ImageIcon icon = new ImageIcon("File Path");
        
        EMPLID.setForeground(Color.WHITE); // Set text color to white
        EMPLID.setFont(new Font("Dialog", Font.PLAIN, 12)); // Set font and size
        EMPLID.setHorizontalAlignment(SwingConstants.LEFT); // Center align text
        EMPLID.setBounds(0, 40, 210, 20); // Adjust bounds
        
        spring.setForeground(Color.WHITE); 
        spring.setFont(new Font("Dialog", Font.PLAIN, 12)); 
        spring.setHorizontalAlignment(SwingConstants.LEFT); 
        spring.setBounds(0, 80, 210, 20); 

		//left.setBackground(Color.RED);
		left.setIcon(icon);
		left.setOpaque(true);
		left.setBounds(0, 0, 90, 125);
		
		
		bottomLeft.setBackground(new Color(0, 0, 139));
		bottomLeft.setOpaque(true);
		bottomLeft.setBounds(0, 125, 90, 75);

		
		right.setBackground(new Color(0, 0, 139));
		right.setOpaque(true);
		right.setBounds(90, 0, 210, 200);
		right.add(name);
		right.add(EMPLID);
		right.add(spring);

		add(left);
		add(bottomLeft);
		add(right);
		
	}

	

}
