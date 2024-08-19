/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentGradeCalculator;

/**
 *
 * @author HP
 */
import java.util.Scanner;
public class StudentGradeCalculator {
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
    
    //Input: Take marks obtained in each subject
    System.out.print("Enter the number of subjects");
    int numSubjects = scanner.nextInt();
    int[] marks = new int[numSubjects];
    int totalMarks = 0;
    
    for(int i=0; i<numSubjects; i++){
    System.out.print("Enter Marks for subject" + (i + 1) + ":");
    marks[i] = scanner.nextInt();
    totalMarks += marks[i];
    }
    
    //Calculate Total Marks
    System.out.print("Total marks:" + totalMarks);
    
    //Calculate Average Percentage
    double averagePercentage = (double) totalMarks/numSubjects;
    System.out.println("Average Percentage:" + averagePercentage + "%");
    
    //Grade Calculation 
    char grade;
    if(averagePercentage >=90)
    {
    grade = 'A';
    }
    else if (averagePercentage >=80)
    {
    grade = 'B';
    }
    else if (averagePercentage >=70)
    {
    grade = 'C';
    }
    else if (averagePercentage >=60)
    {
    grade = 'D';
    }
    else if (averagePercentage >=50)
    {
    grade = 'E';
    }
    else
    {
    grade = 'F';
    }
    System.out.println("Grade:" + grade);
    
    //Display Results
    System.out.println("\n Results");
    System.out.println("\n Total Marks:" + totalMarks);
    System.out.println("\n Average Percentage:" + averagePercentage + "%");
    System.out.println("\n Grade:" + grade);
    
    scanner.close();
    }
}

