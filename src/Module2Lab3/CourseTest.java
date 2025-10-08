package Module2Lab3;

public class CourseTest
{
    public static void main(String[] args)
    {
        Course compSci = new Course("COSC 1437", "Computer Science", "Kevin Roark", 4);
        Course philosophy = new Course("PHIL 1301", "Intro to Philosophy", "James Bryant", 3);
        Course history = new Course("HIST 2301", "Texas History", "Sheena Cox", 3);
        Course puterSci = new Course("COSC 1437", "Computer Science", "Raymond Scott",4);

        // toString demonstration
        System.out.println(compSci.toString());
        System.out.println(philosophy.toString());
        System.out.println(history.toString());
        System.out.println(puterSci.toString());

        //equals demonstration
        System.out.println("Does " + compSci.getCourseCode() + " equal " + philosophy.getCourseCode() + "?");
        System.out.println(compSci.equals(philosophy));

        System.out.println("Does " + philosophy.getCourseCode() + " equal " + history.getCourseCode() + "?");
        System.out.println(philosophy.equals(history));

        System.out.println("However, does " + compSci.getCourseCode() + " taught by " + compSci.getInstructor() +
                " equal " + puterSci.getCourseCode() + " taught by " + puterSci.getInstructor() + "?");
        System.out.println(compSci.equals(puterSci));

        // Hash Codes
        System.out.println("And now for some hash codes: ");
        System.out.println(compSci.hashCode());
        System.out.println(puterSci.hashCode());
        System.out.println(history.hashCode());
        System.out.println(philosophy.hashCode());

    }
}
