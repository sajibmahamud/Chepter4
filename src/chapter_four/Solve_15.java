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
public class Solve_15 {
    Solve_15(){
        Scanner input = new Scanner(System.in);
  int n1 = input.nextInt();
  int n2 = input.nextInt();
  if (n2 < n1) {
   int temp = n2;
   n2 = n1;
   n1 = temp;
  }
 for (int d = n1; true; d--) {
 if (n1 % d == 0 && n2 % d == 0) {
    System.out.println("The GCD is:" + d);
    break;
    //copy bujte hobe
   }
 
  }
    }
}
