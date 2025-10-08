package Module3Lab2;
/*
    James Quinn
    09/24/2025
    This class will contain the variables and logic necessary to define an address that someone may live in, as well
    as validation logic to ensure input makes sense.
 */
public class Address
{
    // Instance variables
    private String street;
    private String city;
    private String state;
    private String zip;

    // Constructors
    public Address()
    {
        setStreet(""); // Since the constructor should set these values properly if my safeguards work, I'm going to
        setCity("");   // give these empty strings in the default constructor, just as a test
        setState("");
        setZip("");
    }

    public Address(String street, String city, String state, String zip)
    {
        setStreet(street);
        setCity(city);
        setState(state);
        setZip(zip);
    }

    public Address(Address copyAddress)
    {
        setStreet(copyAddress.getStreet());
        setCity(copyAddress.getCity());
        setState(copyAddress.getState());
        setZip(copyAddress.getZip());
    }

    // Getters
    public String getStreet()
    {
        return street;
    }

    public String getCity()
    {
        return city;
    }

    public String getState()
    {
        return state;
    }

    public String getZip()
    {
        return zip;
    }

    // Setters
    public void setStreet(String street)
    {
        if (street == null || street.isEmpty()) {
            this.street = "Empty Street";
        }
        else
        {
            this.street = street;
        }
    }

    public void setCity(String city)
    {
        if (city == null || city.isEmpty())
        {
            this.city = "Empty City";
        }
        else
        {
            this.city = city;
        }
    }

    public void setState(String state)
    {
        if (state == null || state.isEmpty())
        {
            this.state = "No state";
        }
        else
        {
            this.state = state;
        }
    }

    public void setZip(String zip)
    {
        if (zip == null || zip.length() != 5)
        {
            this.zip = "12345";
        }
        else
        {
            this.zip = zip;
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        return street + ", " + city + ", " + state + " " + zip;
    }
}
