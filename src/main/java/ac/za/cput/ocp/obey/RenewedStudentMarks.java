package ac.za.cput.ocp.obey;

/**
 *
 */
public class RenewedStudentMarks implements Grade{
    public String marks(int score)
    {
        if(score >= 85)
            return "A";
        else if(score < 85 && score >= 75)
            return "B";
        else if(score  < 75 && score >= 65)
            return "C";
        else if(score < 65 && score >= 55)
            return "D";
        else if(score < 55 && score >= 45)
            return "DD";
        else
            return "Student has failed the quiz.";
    }
}
