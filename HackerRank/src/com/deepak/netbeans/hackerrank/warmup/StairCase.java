/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.warmup;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class StairCase {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
