package ac.za.cput.ocp.obey;

/**
 *
 */
public class StudentMarksImplementation {
    private Grade grade;

    public StudentMarksImplementation()
    {
        grade = new RenewedStudentMarks();
    }

    public String getScore(int score) {
        return grade.marks(score);
    }


}


