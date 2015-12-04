/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.strings;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class AlternatingStrings {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int trys = in.nextInt();
        in.nextLine();
        
        //Start the show
        for (int i=0; i<trys; i++) {
            String line = in.nextLine();
            String lower = line.toLowerCase();
            String[] nums = lower.split("");
            int l = lower.length();
            int[] b = new int[l+1]; 
            
            // Get input to b array
            for (int j=0; j<l; j++) {
                char c = nums[j+1].charAt(0);
                b[j] = (int) c;
                //System.out.println(b[j]);
            }
            //
            
            // Check the alternating string to delete
            int counter = 0;
            for (int j=0; j<l-1; j++) {
                if (b[j] == b[j+1]) {
                    counter++;
                }
            }
            System.out.println(counter);
            //
        }
        //
    }
    
}
