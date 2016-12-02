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
public class Solve_10 {
    Solve_10(){
        int count = 1;
        System.out.println("Numbers that are divisible by 5:");
       for (int i = 100; i <= 1000; i++) {
         if (i % 5 == 0)
        System.out.print(i );

            }
       System.out.println("\nNumbers that are divisible by 6:");
        for (int i = 100; i <= 1000; i++) {
        if (i % 6 == 0)

                System.out.print(i);

            }
    }
}
