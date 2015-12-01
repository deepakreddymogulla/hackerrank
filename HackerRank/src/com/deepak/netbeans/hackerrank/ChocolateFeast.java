/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class ChocolateFeast {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int trys = in.nextInt();
        //System.out.println("lanes:"+lanes);
        
        in.nextLine();
        
        for (int i=1; i<=trys; i++) {
            String line = in.nextLine();
            String[] nums = line.split(" ");
            int b[] = new int[3];
            for (int j=0; j<3; j++) {
                b[j] = Integer.parseInt(nums[j]);
                //System.out.println("b["+j+"]:"+b[j]);
            }
            int actual = b[0]/b[1];
            //System.out.println("actual:"+actual);
            int extra = 0;
            int wrappers =0;
            if (b[2]!=0){
                if (actual < b[2]) {
                    //System.out.println("In true condition..");
                    System.out.println(actual);
                } else {
                    //System.out.println("In false condition..");
                    extra = actual/b[2];
                    //System.out.println("extra:"+extra);
                    wrappers = actual%b[2];
                    //System.out.println("wrappers:"+wrappers);
                    actual = actual + extra;
                    //System.out.println("actual:"+actual);
                    int ew = 0;
                    while ((extra+wrappers)>=b[2]) {
                        ew = extra+wrappers;
                        wrappers = ew%b[2];
                        extra = ew/b[2];
                        actual = actual + extra;
                        //System.out.println("extra in while loop:"+extra);
                        //System.out.println("wrappers in while loop:"+wrappers);
                        //System.out.println("actual in while loop:"+actual);
                        //System.out.println("In while loop..");

                    }
                    System.out.println(actual);
                }
            } else {
                System.out.println(actual);
            }
        }
    }
    
}
