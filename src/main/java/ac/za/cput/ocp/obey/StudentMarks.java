package ac.za.cput.ocp.obey;

/**

 */
public class StudentMarks implements Grade {
    public String marks(int score)
    {
       if(score >= 90)
           return "A";
        else if(score < 90 && score >= 80)
           return "B";
        else if(score  < 80 && score >= 70)
           return "C";
        else if(score < 70 && score >= 60)
           return "D";
       else if(score < 60 && score >= 50)
           return "DD";
        else
           return "Student does failed the quiz.";
    }

}
