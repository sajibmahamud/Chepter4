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
public class Solve_16 {
    Solve_16(){
  System.out.print("Enter an intergers:");
  Scanner input = new Scanner(System.in);
  int n = input.nextInt();
  int i = 2;
  String s = "";
  while (n != 1) {
   if (n % i == 0) {
    s= s+","+i;
    n=n/i;
    i=2;
   } 
   else{
    i++;
   }
 
  }
 
  System.out.print("The factors are:" + s.substring(2) + ".");
 }
    }

