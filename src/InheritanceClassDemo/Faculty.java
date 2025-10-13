package InheritanceClassDemo;

public class Faculty extends Person
{
    private String facultyOffice;

    // Constructors
    public Faculty()
    {
        super();
        facultyOffice = "N/A";
    }

    public Faculty(String fullName, String bannerID, String email, String facultyOffice)
    {
        super(fullName, bannerID, email);
        this.facultyOffice = facultyOffice;
    }

    // Getters
    public String getFacultyOffice()
    {
        return facultyOffice;
    }

    // Setters
    public void setFacultyOffice(String facultyOffice)
    {
        if (facultyOffice == null || facultyOffice.isEmpty())
        {
            this.facultyOffice = "N/A";
        }
        else
        {
            this.facultyOffice = facultyOffice;
        }
    }


    // Overrides
    @Override
    public String toString()
    {
        return super.toString()
                + "\nOffice: " + facultyOffice;
    }

}
