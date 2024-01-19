package Assignment1;
public class Student extends Person {
    private String sID; // Short for student's ID
    private String grade; // Grade is in letter grade, from A+ to F

    // Constructor
    public Student(String name, String email, String studentId, String grade) {
        super(name, email); // Calling the constructor for name and email from Person class
        this.sID = studentId;
        this.grade = grade;
    }

    // Getter and setter for sID
    public String getsID() {
        return sID;
    }

    public void setsID(String studentId) {
        this.sID = studentId;
    }

    // Getter and setter for grade
    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    // Get ID method implementation
    public String getId() {
        return getsID();
    }
}
