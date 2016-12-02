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
public class Solve_4 {
    Solve_4(){
  int last = 10;
  double b=1.609;
  System.out.printf("%-9s%15s\n", "Miles", "Kilometers");
  for (int i =1; i<=last;i++) {
   System.out.printf("%-9d%15.1f\n", i, i *b);
 }
    }
}
