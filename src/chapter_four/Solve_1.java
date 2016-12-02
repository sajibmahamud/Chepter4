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
public class Solve_1 {
    Solve_1(){
  Scanner input = new Scanner(System.in);
  System.out.print("Enter an integer, press 0 to end:");
  int n, neg = 0, pos = 0;
  float sum = 0;
  while ((n = input.nextInt()) != 0) {
   sum = sum + n;
   if (n > 0) {
    pos++;
   }
   else 
    if (n < 0) {
    neg++;
   }
 
  }
 
  if (pos + neg == 0) {
   System.out.println("No numbers are entered except 0");
   System.exit(0);
  }
 
  System.out.println("The number of positives is " + pos);
  System.out.println("The number of negatives is " + neg);
  System.out.println("The total is " + sum);
  System.out.println("The average is " + (sum / (pos + neg)));
 
 }
    }

