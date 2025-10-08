package Module3Lab2;

/*
    James Quinn
    09/24/2025
    This class will contain the variables and logic necessary to define an employee, including what job they have and
    what their address is.
 */
public class Employee
{
    // Instance variables
    private String firstName;
    private String lastName;
    private int employeeId;
    private Job job;
    private Address address;

    // Constructors
    public Employee()
    {
        setFirstName("");
        setLastName("");
        setEmployeeId(0);
        setJob(new Job());
        setAddress(new Address());
    }

    public Employee(String firstName, String lastName, int employeeId, Job job, Address address)
    {
        setFirstName(firstName);
        setLastName(lastName);
        setEmployeeId(employeeId);
        setJob(job);
        setAddress(address);
    }

    public Employee(Employee copyEmp)
    {
        setFirstName(copyEmp.getFirstName());
        setLastName(copyEmp.getLastName());
        setEmployeeId(copyEmp.getEmployeeId());
        setJob(copyEmp.getJob());
        setAddress(copyEmp.getAddress());
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

    public int getEmployeeId()
    {
        return employeeId;
    }

    public Job getJob()
    {
        return job;
    }

    public Address getAddress()
    {
        return address;
    }

    // Setters

    /*
        Every setter in this program has mostly the same logic:
        If the setter receives an empty String or null object, then it will set the value to something
        basic.
     */
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

    public void setEmployeeId(int employeeId)
    {
        if (employeeId <= 0)
        {
            this.employeeId = 111111;
        }
        else
        {
            this.employeeId = employeeId;
        }
    }

    public void setJob(Job job)
    {
        if (job == null)
        {
            this.job = new Job();
        }
        else
        {
            this.job = new Job(job);
        }
    }

    public void setAddress(Address address)
    {
        if (address == null)
        {
            this.address = new Address();
        }
        else
        {
            this.address = new Address(address);
        }
    }


    // Overrides
    @Override
    public String toString()
    {
        return "Employee Information: " +
                "\nName: " + firstName + " " + lastName
                + "\nEmployee ID: " + employeeId +
                "\nEmployee address: " + address.toString()
                + job.toString();
    }
}
