/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class SherLockBeast {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        //Start loop to read ints
        for(int i=1; i<=num; i++){
            //System.out.println("i:"+i);
            int k = in.nextInt();
            
            // Flow of possible cases
            switch (k) {
                case 0: System.out.print("-1"); break;
                case 1: System.out.print("-1"); break;
                case 2: System.out.print("-1"); break;
                case 4: System.out.print("-1"); break;
                case 7: System.out.print("-1"); break;
                default: analyzeK(k);
            }
            //
            System.out.println();
        } 
        //
   }
    
    private static void analyzeK(int k) {
        // Printing the code
        int z = k%3;
        if ((k%3) == 0) {
            for (int i=1; i<=k/3; i++) {
            System.out.print("555");
            }
        } else {
            int n = (3-z)*5;
            k = k-n;
            for (int i=1; i<=k/3; i++) {
                System.out.print("555");
            }
            for (int i=1; i<=n/5; i++) {
                System.out.print("33333");
            }
        }
        //
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
