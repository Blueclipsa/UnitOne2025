package InheritanceClassDemo;

public class Student extends Person
{
    private double gpa;

    public Student()
    {
        super();
        this.gpa = 0.0;
    }

    public Student(String fullName, String bannerID, String email, double gpa)
    {
        super(fullName, bannerID, email);
        this.gpa = gpa;
    }

    // Getters
    public double getGpa()
    {
        return gpa;
    }

    // Setters
    public void setGpa(double gpa)
    {
        this.gpa = gpa;
    }

    // Overrides
    @Override
    public String toString()
    {
        return super.toString()
                + "\nGPA: " + gpa;
    }
}
