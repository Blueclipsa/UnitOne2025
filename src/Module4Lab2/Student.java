package Module4Lab2;

public class Student
{
    // Instance Variables
    private String firstName;
    private String lastName;
    private String bannerID;

    public Student()
    {
        setFirstName("");
        setLastName("");
        setBannerID("");
    }

    public Student(String firstName, String lastName, String bannerID)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setBannerID(bannerID);
    }

    // Getters
    public String getFirstName()
    {
        return firstName;
    }

    public String getLastName()
    {
        return lastName;
    }

    public String getBannerID()
    {
        return bannerID;
    }

    // Setters
    public void setFirstName(String firstName)
    {
        if (firstName == null || firstName.isEmpty())
        {
            this.firstName = "John";
        }
        else
        {
            this.firstName = firstName;
        }
    }

    public void setLastName(String lastName)
    {
        if (lastName == null || lastName.isEmpty())
        {
            this.lastName = "Doe";
        }
        else
        {
            this.lastName = lastName;
        }
    }

    public void setBannerID(String bannerID)
    {
        if (bannerID == null || bannerID.isEmpty())
        {
            this.bannerID = "000000000";
        }
        else
        {
            this.bannerID = bannerID;
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        return String.format("Student: \n\tName: %s %s" +
                "\n\tBanner ID: %s", firstName, lastName, bannerID);
    }
}
