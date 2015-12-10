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
public class Kaprekar {
    
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int srt = in.nextInt();
        int end = in.nextInt();
        int chk = 0;
        
        // Get inputs 
        for (int i=srt; i<=end; i++) {
            long s = 0;
            int len = 0;
            String si = null;
            String str = null;
            
            // Split square to right and left
            si = Integer.toString(i);
            len = si.length();
            //System.out.println("len: "+len);
            //System.out.println("si: "+si);
            s = i*i;
            //System.out.println("s: "+s);
            str = Long.toString(s);
            int slen = str.length();
            //System.out.println("slen: "+slen);
            String r = str.substring(slen-len);
            String l = str.substring(0, (slen-len));
            //System.out.println("r: "+r);
            //System.out.println("l: "+l);
            //
            
            // Check if it is Kaprekar
            if ("".equals(r)) {
                r = "0";
            }
            if ("".equals(l)) {
                l = "0";
            }
            if (Integer.parseInt(l)+Integer.parseInt(r) == i) {
                System.out.print(i+" ");
                chk = 1;
            }
            //
        }
        //
        if (chk == 0) {
            System.out.println("INVALID RANGE");
        }  
    }
}
