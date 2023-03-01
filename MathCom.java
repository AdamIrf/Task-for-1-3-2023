public class MathCom extends StudInfo{

    //Math competency information
    private double marks ;
    private String grade ;

    public MathCom (String name, int age, int student_id, int marks, String grade){

        super(name ,age ,student_id) ;//bring back information from StudentInfo.java

        this.marks = marks ;
        this.grade = grade ;

    }

    // for marks part
    /*public void setmarks(double marks){

        this.marks = marks ;
    }*/
    public double getmarks(){

        return marks ;

    }

    //for grade part
    /*public void setgrade(String grade){

        this.grade = grade ;

    }*/
    public String getgrade(){

        return grade ;

    }

    public void PrintDetails(){

        super.PrintDetails() ;
        System.out.println("Marks  : " +marks ) ;
        System.out.println("Grade  : " +grade ) ;
        System.out.println("\n") ;
    }

}