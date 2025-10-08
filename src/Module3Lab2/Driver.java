package Module3Lab2;

public class Driver
{
    public static void main(String[] args)
    {
        // The first employee will be properly created with all fields set
        Employee employeeOne = new Employee("Jacob", "Smith", 12215,
                new Job("Management", "CEO"),
                new Address("712 Azure Street", "Atlanta", "Georgia","30033"));

        // The second employee has been created with several null inputs and a default Job constructor.
        Employee employeeTwo = new Employee("", null, 12243,
                new Job(),
                new Address("242 Wilderness Creek", "Atlanta", "", null));

        System.out.println("Employee One Information: ");
        System.out.println(employeeOne.toString());
        System.out.println();
        System.out.println("Employee Two Information: ");
        System.out.println(employeeTwo.toString());
        System.out.println();
        System.out.println("Now I will create a deep copy of Employee Two and correct the messed up data.");
        Employee fixedEmployeeTwo = new Employee(employeeTwo);

        fixedEmployeeTwo.setFirstName("Richard");
        fixedEmployeeTwo.setLastName("Jamieson");
        fixedEmployeeTwo.getAddress().setState("Georgia");
        fixedEmployeeTwo.getAddress().setZip("30301");
        fixedEmployeeTwo.getJob().setRole("COO");
        fixedEmployeeTwo.getJob().setDepartment("Management");

        System.out.println("Here is the corrected info: ");
        System.out.println(fixedEmployeeTwo.toString());
        System.out.println();
        System.out.println("And here is the original, unmodified Employee");
        System.out.println(employeeTwo.toString());

    }
}
