package Module4Lab2;

import java.util.ArrayList;
import java.util.HashMap;

public class Driver
{
    public static void main(String[] args)
    {
        // Initialize ArrayList | Contents: 5 new Student objects with data
        ArrayList<Student> students = new ArrayList<Student>();
        students.add(new Student("Jessica", "Rigsby", "901235454"));
        students.add(new Student("David", "Rothchild", "902325767"));
        students.add(new Student("Samuel", "Wong", "901547765"));
        students.add(new Student("Robert", "Mandonna", "905425543"));
        students.add(new Student("Mohammed", "Abbasi", "901235454"));
    }
}
