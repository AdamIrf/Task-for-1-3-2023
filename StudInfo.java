public class StudInfo{

    //Student information
    private String name ;
    private int age ;
    private int student_id ;

    public StudInfo(String name, int age, int student_id){

        this.name = name ;
        this.age = age ;
        this.student_id = student_id ;

    }

    //for name part
    /*public void setname(String name){
        this.name = name ;
    }*/
    public String getname(){
        return name ;
    }

    //for age part
    /*public void setage(int age){
        this.age = age ;
    }*/
    public int getage(){
        return age ;
    }

    //for student id
    /*public void setstudentid(int student_id){
        this.student_id = student_id ;
    }*/
    public int getstudentid(){
        return student_id ;
    }

    public void PrintDetails(){
        System.out.println("***STUDENT INFORMATION****\n") ;
        System.out.println("Name       : " +name ) ;
        System.out.println("Age        : " +age ) ;
        System.out.println("Student ID : " +student_id ) ;
    }
}
