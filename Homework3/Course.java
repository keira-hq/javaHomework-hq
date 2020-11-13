import java.util.ArrayList;
import java.util.Collections;

public class Course implements Cloneable
{
    private String courseName;
    private String[] students = new String[100];
    private int numberOfStudents;

    public Course(String courseName)
    {
        this.courseName = courseName;
    }

    public void addStudents(String student)
    {
        students[numberOfStudents] = student;
        numberOfStudents++;
    }

    public String[] getStudents()
    {
        return students;
    }

    public int getNumberOfStudents()
    {
        return numberOfStudents;
    }

    public String getCourseName()
    {
        return courseName;
    }



    @Override
    public Object clone() {
        try{
            //perform a shollow copy
            Course courseClone = (Course)super.clone();
            //deep copy on students
            courseClone.students = (String[])(students.clone());
            return courseClone;
        }
        catch(CloneNotSupportedException ex){
            return null;
        }

    }
}