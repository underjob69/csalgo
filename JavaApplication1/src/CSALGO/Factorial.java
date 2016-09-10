/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CSALGO;

import java.util.Scanner;

/**
 *
 * @author jtpresentacion
 */
public class Factorial {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int num;
       Scanner input = new Scanner(System.in);
       System.out.print("boom albert");
       num = input.nextInt();
       sum(num);
       System.out.print(sum(num));
       System.out.print("Tasdasdasdest git");
    }
    static int sum(int n){
        if(n==1){
            return 1;
        }else{
            return n+ sum(n-1);
        }
    }
}
