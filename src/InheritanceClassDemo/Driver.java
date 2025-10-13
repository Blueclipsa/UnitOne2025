package InheritanceClassDemo;

public class Driver
{
    public static void main(String[] args)
    {
        Person testPerson = new Person("James Quinn", "901213345", "blueclipsa@gmail.com");
        Student testStudent = new Student("Joseph Quinn", "901312345", "synexo@gmail.com", 3.3);
        Faculty testFaculty = new Faculty("Kevin Roark", "123456789", "kevin@alamo.edu", "Room 215");
        System.out.println(testPerson.toString());
        System.out.println(testStudent.toString());
        System.out.println(testFaculty.toString());
    }
}
