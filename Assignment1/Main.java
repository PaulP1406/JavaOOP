package Assignment1;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        // Filling the list with randomly generated names and emails and ids, all of
        // them are random and not from real people
        // Instructors
        people.add(new Instructor("Test", "dchd4@sfu.ca", "E3015999829389"));
        people.add(new Instructor("John Doe", "abc1@sfu.ca", "E30159998293"));
        people.add(new Instructor("Jane Smith", "def2@sfu.ca", "E30159997531"));
        people.add(new Instructor("Alice Johnson", "ghi3@sfu.ca", "E30159996472"));
        people.add(new Instructor("Bob Brown", "jkl4@sfu.ca", "E30159995312"));
        people.add(new Instructor("Carol White", "mno5@sfu.ca", "E30159994258"));

        // Students
        people.add(new Student("Paul", "ddp4@sfu.ca", "301539489", "A"));
        people.add(new Student("Robson Green", "pqr6@sfu.ca", "3015394891", "B+"));
        people.add(new Student("Lisa Gray", "stu7@sfu.ca", "3015394892", "F"));
        people.add(new Student("Kevin Black", "vwx8@sfu.ca", "3015394893", "C-"));
        people.add(new Student("Sarah Blue", "yz123@sfu.ca", "3015394894", "A-"));
        people.add(new Student("David Red", "abc9@sfu.ca", "3015394895", "B"));

        // Writing the details of each class member to a file
        try (FileWriter writer = new FileWriter("Assignment1/PrintedList.txt")) {
            for (Person person : people) {
                String printer;
                if (person.getDetails() == "Instructor") {
                    Instructor instructor = (Instructor) person; // Casting to instructor type so we can use getID
                                                                 // method
                    printer = "Type: Instructor, "
                            + "Name: " + instructor.getName()
                            + ", " + "Email: " + instructor.getEmail()
                            + ", ID: " + instructor.getId();
                } else if (person.getDetails() == "Student") {
                    Student student = (Student) person; // Casting to student type so we can use getGrade and getID
                                                        // method
                    printer = "Type: Student, "
                            + "Name: " + student.getName()
                            + ", " + "Email: " + student.getEmail()
                            + ", ID: " + student.getId()
                            + ", Grade: " + student.getGrade();
                } else {
                    printer = "";
                }

                String newLine = System.lineSeparator();
                writer.write(printer + newLine);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
