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
public class LibraryFine {
    
    private static int fine;
    public static void main (String args[]) {
        
        Scanner in = new Scanner(System.in);
        int[] a = new int[3];
        int[] e = new int[3];
        
        // Acquire actual date
        a[0] = in.nextInt();
        a[1] = in.nextInt();
        a[2] = in.nextInt();
        //
        
        // Acquire expected date
        e[0] = in.nextInt();
        e[1] = in.nextInt();
        e[2] = in.nextInt(); 
        //
        
        // Calculating fine
        calculateFine(a,e);
        //
    }

    private static void calculateFine(int[] a, int[] e) {
        //int fine;
        
        // Checking conditions
        
        // Check year conditions
        if (a[2] < e[2]) {
            fine = 0;
        } else if (a[2] > e[2]) {
            fine = 10000;
        } else {
            // Checking month conditions
            if (a[1] < e[1]) {
                fine = 0;
            } else if (a[1] > e[1]) {
                fine = (a[1]-e[1])*500;
            } else {
                // Checking daya condition
                if (a[0] <= e[0]) {
                    fine = 0;
                } else {
                    fine = (a[0]-e[0])*15;
                }
                //
            }
            //
        }
        //
        System.out.println(fine);
        //
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
