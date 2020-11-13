
public class Homework1313{
    public static void main(String [] args )
    {
        Course course1 = new Course("Java");
        course1.addStudents("Keira");
        course1.addStudents("Lucy");
        System.out.println(course1.getNumberOfStudents());

        Course course2 = (Course)course1.clone();
        System.out.println(course2.getNumberOfStudents());
        System.out.println(course1.equals(course2));
    }
}