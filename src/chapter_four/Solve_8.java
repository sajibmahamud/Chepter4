/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package chapter_four;

/**
 *
 * @author sajib
 */
import java.util.Scanner;
public class Solve_8 {
    Solve_8(){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter the number of students:");
  int n = input.nextInt();
  int max = 0;
  String maxName = "";
  for (int i = 0; i < n; i++) {
   System.out.print("Enter name and score of student (" + (i + 1)+ "");
   String name = input.next();
   int score = input.nextInt();
   if (score > max) {
    max = score;
    maxName = name;
   }
 
  }
 
  System.out.println("The student with the highest score is " + maxName);
  System.out.println("The highest score is " + max);
    }
}
