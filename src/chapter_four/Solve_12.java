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
public class Solve_12 {
    Solve_12(){
         int n = 1;
  while (Math.pow(n, 2) <= 12000) {
   n++;
  }
 
  System.out.println("The n is " + n);
  System.out.println("The n^2 is " + Math.pow(n, 2));
 
 }
    }

