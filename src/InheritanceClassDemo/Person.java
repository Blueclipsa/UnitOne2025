package InheritanceClassDemo;

public class Person
{
    // Instance variables
    private String bannerID;
    private String fullName;
    private String email;

    // Constructors
    public Person()
    {
        setFullName("");
        setBannerID("");
        setEmail("");
    }

    public Person(String fullName, String bannerID, String email)
    {
        setFullName(fullName);
        setBannerID(bannerID);
        setEmail(email);
    }

    public Person (Person copyPerson)
    {
        setFullName(copyPerson.getFullName());
        setBannerID(copyPerson.getBannerID());
        setEmail(copyPerson.getEmail());
    }

    // Getters
    public String getBannerID()
    {
        return bannerID;
    }

    public String getFullName()
    {
        return fullName;
    }

    public String getEmail()
    {
        return email;
    }

    // Setters
    public void setFullName(String fullName)
    {
        if (fullName == null || fullName.isEmpty())
        {
            this.fullName = "No Given Name";
        }
        else
        {
            this.fullName = fullName;
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

    public void setEmail(String email)
    {
        if (email == null || email.isEmpty())
        {
            this.email = "No Given Email";
        }
        else
        {
            this.email = email;
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        return "\nName: " + fullName
                + "\nBanner ID: " + bannerID
                + "\nEmail: " + email;
    }
}

