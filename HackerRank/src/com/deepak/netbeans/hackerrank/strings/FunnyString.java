/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.strings;

import java.util.Scanner;
import java.lang.Math.*;

/**
 *
 * @author ghm8mog
 */
public class FunnyString {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int trys = in.nextInt();
        in.nextLine();
        for (int m=0; m<trys; m++) {
            int g = 0;
            String line = in.nextLine();
            String[] nums = line.split("");
            int len = nums.length;
            int l = line.length();
            int[] b = new int[l+1];
            int[] r = new int[l+1]; 

            //Get input lines
            for (int j=0; j<l; j++) {
                char c = nums[j+1].charAt(0);
                b[j] = (int) c;
                r[(l-1)-j] = (int) c;
                //System.out.println(b[j]);
            }
            //

            //Check condition
            for (int i=1; i<len/2; i++) {
                int fc = Math.abs((b[i])-(b[i-1]));
                int rc = Math.abs((r[i])-(r[i-1]));
                if (fc != rc) {
                    System.out.println("Not Funny");
                    g = 1;
                    break;
                }
            }
            if (g != 1) {
                System.out.println("Funny");
            }
            //
        }    
    }
}
