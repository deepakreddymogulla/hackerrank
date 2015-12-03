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
public class ServiceLane {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int lanes = in.nextInt();
        //System.out.println("lanes:"+lanes);
        int entries = in.nextInt();
        //System.out.println("entries:"+entries);
        in.nextLine();
        String line = in.nextLine();
        //System.out.println("line:"+line);
        String[] nums = line.split(" ");
        int b[] = new int[lanes];
        for (int j=0; j<lanes; j++) {
            b[j] = Integer.parseInt(nums[j]);
            //System.out.println("b[j]:"+b[j]);
        }
        for (int i=0; i<entries; i++) {
            int count = 3;
            int a1 = in.nextInt();
            int a2 = in.nextInt();
            for (int k=a1; k<=a2; k++) {
                if (b[k]<=count){
                    count = b[k];
                }
            }
            System.out.println(count);
        }
    }
}
