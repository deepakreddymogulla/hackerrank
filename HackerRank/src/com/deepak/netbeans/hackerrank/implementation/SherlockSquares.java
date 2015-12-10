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
public class SherlockSquares {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int trys = in.nextInt();
        
        for (int i=1; i<=trys; i++) {
            long srt = in.nextInt();
            long end = in.nextInt();
            
            double r_srt = Math.ceil(Math.sqrt(srt));
            double r_end = Math.floor(Math.sqrt(end));
            //System.out.println(r_srt);
            //System.out.println(r_end);
            if (r_end == r_srt) {
                System.out.println("1");
            } else if ((r_end*r_end == end) || (r_srt*r_srt == srt)) {
                //System.out.println(r_srt);
                //System.out.println(r_end);
                System.out.println(Math.abs((int) (r_end-r_srt))+1);
            } 
            else {
                r_srt = Math.floor(Math.sqrt(srt));
                //System.out.println(r_srt);
                //System.out.println(r_end);
                //double r_end = Math.floor(Math.sqrt(end));
                System.out.println(Math.abs((int) (r_end-r_srt)));
            }
            //int counter = getCounter(srt,end);
            //System.out.println(counter);
        }
    }

    /*** 
    private static int getCounter(long srt, long end) {
        
        int counter = 0;
            for (long j=srt; j<=end; j++) {
                if (((int) Math.sqrt(j) * (int) Math.sqrt(j)) == j) {
                    counter++;
                }
            }
        return counter;
        //throw new UnsupportedOperationException("Not yet implemented");
    }
    ***/
}
