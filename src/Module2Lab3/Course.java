package Module2Lab3;

import java.util.Objects;

public class Course
{
    // Instance variables
    private String courseCode;
    private String courseTitle;
    private String instructor;
    private int creditHours;

    public Course()
    {
        courseCode = "No Course Code";
        courseTitle = "No Course Title";
        instructor = "No Instructor";
        creditHours = 0;
    }

    public Course(String courseCode, String courseTitle, String instructor, int creditHours)
    {
        this.courseCode = courseCode;
        this.courseTitle = courseTitle;
        this.instructor = instructor;
        this.creditHours = creditHours;
    }


    // Getters

    public String getCourseCode()
    {
        return courseCode;
    }

    public String getCourseTitle()
    {
        return courseTitle;
    }

    public String getInstructor()
    {
        return instructor;
    }

    public int getCreditHours()
    {
        return creditHours;
    }

    // Setters

    public void setCourseCode(String courseCode)
    {
        this.courseCode = courseCode;
    }

    public void setCourseTitle(String courseTitle)
    {
        this.courseTitle = courseTitle;
    }

    public void setInstructor(String instructor)
    {
        this.instructor = instructor;
    }

    public void setCreditHours(int creditHours)
    {
        this.creditHours = creditHours;
    }

    // Overrides
    @Override
    public String toString()
    {
        return courseCode + " - " + courseTitle + " | Instructor: "
                + instructor + " | Credit Hours: " + creditHours;
    }

    @Override
    public boolean equals(Object obj)
    {
        if (this == obj) return true; // If same object, return true
        if (obj == null || getClass() != obj.getClass()) return false; // If null or different class, return false
        Course course = (Course) obj; // Force object into expected class
        return courseCode.equals(course.courseCode); // Return true if courseCode matches
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(courseCode, courseTitle, instructor, creditHours);
    }

}
