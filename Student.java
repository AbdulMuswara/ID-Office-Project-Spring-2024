class Student {
    private String firstName;
    private String lastName;
    private String middle;
    private String phone; 
    private String id; 

    public Student(String firstName, String middle, String lastName, String phone, String id) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.middle = middle;
        this.phone = phone;
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }
    public String getMiddle() {
        return middle;
    }
    public String getPhone() {
        return phone;
    }
    public String getID() {
        return id;
    }
}