/******************************************************************************

 This task completed by Muhamad Adam Irfan Bin Mohd Nizam (22006433)
 1. Submit the complete solution for either
 1) Maths Competency Survey
 Deadline:  1 Mar 2023

 *******************************************************************************/
public class Main
{
    public static void main(String[] args) {


        MathCom[] stu = new MathCom[3];


        MathCom Muhamadmathcom = new MathCom("Muhamad", 17, 22006433, 68, "B+") ;
        MathCom Adammathcom = new MathCom("Adam", 18, 22006432, 96, "A+") ;
        MathCom Irfanmathcom = new MathCom("Irfan", 20, 22006431, 54, "C") ;

        stu[0]= Muhamadmathcom;
        stu[1] = Adammathcom;
        stu[2] = Irfanmathcom;

        int highestInd = 0;//index for highest

        for (int i = 0; i < 3; i++) {
            if(stu[i].getmarks() > stu[highestInd].getmarks()){
                highestInd = i;
            }
        }

        int lowestInd = 0;//index for lowest

        for (int i = 0; i < 3; i++) {
            if(stu[i].getmarks() < stu[lowestInd].getmarks()){
                lowestInd = i;
            }
        }

        Muhamadmathcom.PrintDetails() ;

        Adammathcom.PrintDetails() ;

        Irfanmathcom.PrintDetails() ;

        System.out.println("The highest Marks :- \n") ;
        stu[highestInd].PrintDetails();

        System.out.println("The lowest Marks :- \n") ;
        stu[lowestInd].PrintDetails();
    }
}