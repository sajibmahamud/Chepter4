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
public class Solve_13 {
    Solve_13(){
        int n = 1;
  while (Math.pow(n, 3) <= 12000) {
   n++;
  }
   n--;
  System.out.println("The n is " + n);
  System.out.println("The n^3 is " + Math.pow(n, 3));
 }
    }

