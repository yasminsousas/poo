package student;

import java.util.Locale;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US); 
        Scanner sc = new Scanner(System.in); 
         
        Student student = new Student(); 
           
        System.out.print("Enter student name: ");
        student.name = sc.nextLine(); 
        System.out.print("Enter Grade 1: ");
        student.grade1 = sc.nextDouble(); 
        System.out.print("Enter Grade 2: ");
        student.grade2 = sc.nextDouble(); 
        System.out.print("Enter Grade 3: ");
        student.grade3 = sc.nextDouble(); 
           
        System.out.printf("FINAL GRADE: " + student.finalGrade()); 
        System.out.println();
        
        if (student.finalGrade() < 60.0) { 
            System.out.println("FAILED"); 
            System.out.printf("MISSING POINTS: "+ student.missingPoints()); 
        } else { 
            System.out.println("PASS"); 
        } 
        sc.close();
    }
}
