/******************************************************************************
 This task completed by Muhamad Adam Irfan Bin Mohd Nizam (22006433)
 1. Submit the complete solution for either
 1) Maths Competency Survey
 Deadline:  6 Mar 2023
 *******************************************************************************/

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        List<Student> students = new ArrayList<Student>();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number of students: ");
        int numStudents = input.nextInt();

        for (int i = 1; i <= numStudents; i++) {

            System.out.print("Enter the name of student " + i + ": ");
            String name = input.next();

            System.out.print("Enter the marks of student " + i + ": ");
            int marks = input.nextInt();

            System.out.println("Enter the grade of marks : ");
            String grade = input.next();

            students.add(new Student(name, marks,grade));

            clearScreen();
        }

        Student highestScorer = getHighestScorer(students);

        System.out.println("\nThe student with the highest marks is " + highestScorer.getName() +
                " with " + highestScorer.getMarks() + " marks." + "\nThe grade is " +highestScorer.getGrade());
    }

    public static Student getHighestScorer(List<Student> students) {

        Student highestScorer = null; //assign value to nothing (data type student)

        int highestMarks = Integer.MIN_VALUE; //initial value to keep track min/max value

        for (Student student : students) { //did iteration in Student object

            int marks = student.getMarks();

            if (marks > highestMarks) {

                highestMarks = marks;

                highestScorer = student;
            }
        }

        return highestScorer;
    }

    public static void clearScreen() {
        System.out.print("\n".repeat(5));

    }

}