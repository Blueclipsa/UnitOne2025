package Module3Lab2;
/*
    James Quinn
    09/24/2025
    This class will contain the variables and logic necessary to define a single job with a given role and department
    Contains validation logic to prevent empty Strings from being assigned.
 */
public class Job
{
    // Instance variables
    private String department;
    private String role;

    // Constructors
    public Job()
    {
        setDepartment("");
        setRole("");
    }

    public Job(String department, String role)
    {
        setDepartment(department);
        setRole(role);
    }

    public Job(Job copyJob)
    {
        setDepartment(copyJob.getDepartment());
        setRole(copyJob.getRole());
    }

    // Getters
    public String getDepartment()
    {
        return department;
    }

    public String getRole()
    {
        return role;
    }

    // Setters
    public void setDepartment(String department)
    {
        if   (department == null || department.isEmpty())
        {
            this.department = "No Assigned Department";
        }
        else
        {
            this.department = department;
        }
    }

    public void setRole(String role)
    {
        if   (role == null || role.isEmpty())
        {
            this.role = "No Job Title";
        }
        else
        {
            this.role = role;
        }
    }

    // Overrides
    @Override
    public String toString()
    {
        return "\nDepartment: " + department +
                "\nRole: " + role;
    }
}
