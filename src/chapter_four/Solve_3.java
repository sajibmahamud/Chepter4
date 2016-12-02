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
public class Solve_3 {
    Solve_3(){
    final int last = 199;
    double b=2.2;
   
  System.out.printf("%9s%15s\n","Kilograms","Pounds");
   for(int i=1; i<=last;i++ ){
   System.out.printf("%9d%15.1f\n",i,i*b);
    
  }
    }
}
