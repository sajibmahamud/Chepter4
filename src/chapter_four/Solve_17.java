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
public class Solve_17 {
    
    Solve_17(){
          System.out.print("Enter the number of lines:");
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  for (int i = 1; i <= n; i++) {
   for (int j = 1; j <= (n - i); j++) {
    System.out.print("  ");
   }
   for (int j = i; j >= 1; j--) {
    System.out.print(j + " ");
   }
   for (int j = 2; j <= i; j++) {
    System.out.print(j + " ");
   }
   System.out.println();
 
  }
    }
}
