import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Random;

public class MyJDBC {
    public static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/student_reg"; // Address of server with name of
                                                                                   // schema
    public static final String DB_USERNAME = "root"; // Username for Server
    public static final String DB_PASSWORD = "password"; // Password for Server
    public static final String DB_USERS_TABLE_NAME = "STUDENTS"; // Table Name
    private static int nextID = 10000000; // Initial ID starting point

    // Method to generate a unique ID
    public static String generateID() {
       //return String.valueOf(nextID++);
    	// Create an instance of Random class
        Random random = new Random();

        // Generate a random 8-digit ID
        StringBuilder idBuilder = new StringBuilder();
        for (int i = 0; i < 8; i++) {
            int digit = random.nextInt(10); // Generates a random digit between 0 and 9
            idBuilder.append(digit);
        }
        //checkID being false means the ID doesn't exist
        //doing ! for checkID means if statement will be true and return the id b/c it doesn;t exist
        if (!checkID(idBuilder.toString())) { 
        	return idBuilder.toString();
        }
        else { 
        	generateID();//call itself again to make a random number that doesn't exist if current ID exists
        }

        return idBuilder.toString(); //necessary for code to run
    }

    public static boolean register(String First, String Middle, String Last, String DOB, String Year,
            String Email, String Address, String Phone, String EMPLID) {
        // First check if ID already exists
        try {
            if (!checkID(EMPLID)) {
                // Connect to the database
                Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

                // Create Insert Query
                PreparedStatement insertID = connection.prepareStatement(
                	    "INSERT INTO " + DB_USERS_TABLE_NAME +
                	    "(First, Middle, Last, DOB, Year, Email, Address, Phone, EMPLID)" +
                	    "VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)");

                // Insert parameters in the insert query
                insertID.setString(1, First);
                insertID.setString(2, Middle);
                insertID.setString(3, Last);
                insertID.setString(4, DOB);
                insertID.setString(5, Year);
                insertID.setString(6, Email);
                insertID.setString(7, Address);
                insertID.setString(8, Phone);
                insertID.setString(9, EMPLID);

                insertID.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    public static boolean edit(String First, String Middle, String Last, String DOB, String Year,
                               String Email, String Address, String Phone, String EMPLID) {
        // First check if ID already exists
        try {
            if (checkID(EMPLID)) {
                // Connect to the database
                Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);

                // Create Update Query
                PreparedStatement editID = connection.prepareStatement(
                        "UPDATE " + DB_USERS_TABLE_NAME + " SET First=?, Middle=?, Last=?, DOB=?, Year=?, " +
                                "Email=?, Address=?, Phone=? WHERE EMPLID=?");

                // Insert parameters in the update query
                editID.setString(1, First);
                editID.setString(2, Middle);
                editID.setString(3, Last);
                editID.setString(4, DOB);
                editID.setString(5, Year);
                editID.setString(6, Email);
                editID.setString(7, Address);
                editID.setString(8, Phone);
                editID.setString(9, EMPLID);

                editID.executeUpdate();
                return true;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return false;
    }

    // Checks if ID already exists in database
    public static boolean checkID(String ID) {
        try {
            Connection connection = DriverManager.getConnection(DB_URL, DB_USERNAME, DB_PASSWORD);
            PreparedStatement checkIDExists = connection
                    .prepareStatement("SELECT * FROM " + DB_USERS_TABLE_NAME + " WHERE EMPLID = ?");
            checkIDExists.setString(1, ID);
            ResultSet resultSet = checkIDExists.executeQuery();

            if (!resultSet.isBeforeFirst()) {
                return false;
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return true;
    }
}
