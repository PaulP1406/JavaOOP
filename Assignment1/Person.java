package Assignment1;

public abstract class Person {
    protected String name;
    protected String email;
    protected String details; // Classify either its an instructor or a student

    public Person(String name, String email) {
        this.name = name;
        this.email = email;
    }

    // Abstract method to be filled in by subclasses Intructors and Student
    public abstract String getId();

    public String getDetails() {
        return details;
    }

    // Getter and Setter for name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    // Getter and Setter for email
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
