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
public class CutSticks {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String line = in.nextLine();
        in.close();
        //System.out.println("line:"+line);
        String[] nums = line.split(" ");
        int b[] = new int[len];
        for (int j=0; j<len; j++) {
            b[j] = Integer.parseInt(nums[j]);
            //System.out.println("b[j]:"+b[j]);
        }
        int counter = len;
        while(counter>=1){
            System.out.println(counter);
            int min = 1000;
            
            // Finding minimum value
            for (int i=0; i<len; i++) {
                if (b[i]>0 && b[i]<=min) {
                    min = b[i];
                }
            }
            //System.out.println("min:"+min);
            //
            
            // Cutting sticks
            for (int i=0; i<len; i++) {
                b[i] = b[i]-min;
                if (b[i] == 0) {
                    counter--;
                }
            }
            //
        }
        //System.out.println("1");
        
        
    }
    
}
