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
public class Math {

    static int random() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    static int pow(int n, int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    Math(){
        System.out.println("press 0 to close the program = ");
         Scanner Sc=new Scanner(System.in);
         int c=Sc.nextInt();
         for(int x=0;x<1;x++){
             if(c==0){
        break;
         }
             else{
                 int b=0;
        for(int a=0;a<=10;a++){
        if(a==5 || a==6){
        continue;
        }
        b=b+a;
        
        }
        b=b+c;
        System.out.println(b);
             }
    }
    }
    }

             
                 
         
    
                 


             
    
    

