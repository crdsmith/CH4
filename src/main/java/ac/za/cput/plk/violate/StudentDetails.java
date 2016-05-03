package ac.za.cput.plk.violate;

/**
 *
 */
public class StudentDetails implements Student {
    private String id;
    private String name;
    Marks marks;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getMarks() {
        return marks.getMarks();
    }

   public String toString(){
       return "The marks of the student" + name + "are" + marks.getMarks();
   }
}
