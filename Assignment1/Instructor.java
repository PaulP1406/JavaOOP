package Assignment1;
public class Instructor extends Person {
    private String eId; // Short for employee's ID

    // Constructor
    public Instructor(String name, String email, String employeeId) {
        super(name, email); // Calling the constructor for name and email from Person class
        this.eId = employeeId;
    }

    // Getter and Setter for eId
    public String getEid() {
        return eId;
    }

    public void setEid(String employeeId) {
        this.eId = employeeId;
    }

    // Get ID method implementation
    public String getId() {
        return getEid();
    }
}
