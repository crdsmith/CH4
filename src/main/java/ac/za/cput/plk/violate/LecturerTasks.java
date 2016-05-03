package ac.za.cput.plk.violate;

import java.util.HashMap;
import java.util.Map;
/**
 *
 */
public class LecturerTasks implements Lecturer{
    private Map<String, String> students = new HashMap();
    StudentDetails studentDetails;


    public void addStudent(Student number, Student name )
    {
        students.put(studentDetails.getId(), studentDetails.getName());
    }

    public void removeStudent(Student number, Student name)
    {
        students.remove(studentDetails.getId(), studentDetails.getName());
    }

    public String showMarks(){
        return "The marks of the student" + studentDetails.getName() + "are" + studentDetails.marks.getMarks();
    }

}
