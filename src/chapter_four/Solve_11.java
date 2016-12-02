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
public class Solve_11 {
    Solve_11(){
        int itemCount = 0;
  for(int i=100; i<=200; i++){
   if(i%5 == 0 ^ i%6 == 0){
    System.out.print(i + " ");
    itemCount +=1; 
    if(itemCount==10){
     System.out.println("\n");
     itemCount = 0;
    }
    }
}
    }
}
