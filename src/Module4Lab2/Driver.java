package Module4Lab2;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
/*
    James Quinn
    10/7/2025 - 10/15/2025
    This Driver class will demonstrate the use of ArrayLists, HashMaps, for-each loops using both of the above,
    and the Utility String formatter class.
 */
public class Driver
{
    public static void main(String[] args)
    {
        // Initialize Utility class for later use
        Utility utility = new Utility();
        // Initialize ArrayList | Contents: 5 new Student objects with data
        ArrayList<Student> students = new ArrayList<Student>();
        // Create HashMap to contain Locker (key) and Student (value) pairs
        HashMap<Integer, Student> lockerAssignments = new HashMap<>();

        // Create students and add them to ArrayList
        students.add(new Student("Jessica", "Rigsby", "901235454"));
        students.add(new Student("David", "Rothchild", "902325767"));
        students.add(new Student("Samuel", "Wong", "901547765"));
        students.add(new Student("Robert", "Mandonna", "905425543"));
        students.add(new Student("Mohammed", "Abbasi", "901235454"));

        // Map students to HashMap locker assignment
        int lockerNumber = 101; // Create an integer to start the locker number count
        for (Student student : students) // For each to move through the Student list
        {
            lockerAssignments.put(lockerNumber, student); // Assign current locker number to current student
            lockerNumber++; // Increase locker number by one for next student
        }

        // Print formatted, readable output with classes
        utility.printMessage("Alamo Student List");
        for (Student student : students)
        {
            System.out.println(student.toString());
        }

        utility.printMessage("Alamo Student LOcker Assignments");
        for (Map.Entry<Integer, Student> entry : lockerAssignments.entrySet())
        {
            System.out.println("Locker Number: " + entry.getKey() + " | Student: " + entry.getValue().getFirstName()
                    + " "  + entry.getValue().getLastName());
        }

    }
}
