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
public class Solve_5 {
    Solve_5(){
  int last= 199;
  int first = 20;
  System.out.printf("%-9s%15s","Kilograms","Pounds");
  System.out.print("\t|\t");
  System.out.printf("%-9s%15s\n","Pounds","Kilograms");
  for (int j=0, i = 1; i <= last; i+=2, j+=5) {
   System.out.printf("%-9d%15.1f", i, i * 2.2);
   System.out.print("\t|\t");
   System.out.printf("%-9d%15.1f\n",first+j,(first+j)/2.2);
 
  }
    }
}
