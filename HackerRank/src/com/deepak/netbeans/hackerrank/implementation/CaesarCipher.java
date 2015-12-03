/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class CaesarCipher {
    
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        in.nextLine();
        String code = in.nextLine();
        //System.out.println("code:"+code);
        int key = in.nextInt();
        String[] nums = code.split("");
        int l = code.length();
        //System.out.println("l:"+l);
        int b[] = new int[l+1];
        char d[] = new char[l+1];
        // Load the string ASCII to b array
        for (int j=0; j<l; j++) {
            char c = nums[j+1].charAt(0);
            b[j] = (int) c;
            //System.out.println("b["+j+"]:"+b[j]);
        }
        //
        
        // Tranformation
        for (int i=0; i<l; i++) {
            int k=key%26;
            //System.out.println("k:"+k);
            if(65<=b[i] && b[i]<=90) {
                if ((b[i]+k)>90) {
                    d[i] = (char) (65+(k-(90-b[i]))-1);
                    
                } else {
                    d[i] = (char) (b[i]+k);
                }
            } else if (97<=b[i] && b[i]<=122) {
                if ((b[i]+k)>122) {
                    d[i] = (char) (97+(k-(122-b[i]))-1);
                } else {
                    d[i] = (char) (b[i]+k);
                }
            } else 
            d[i] = (char) b[i];
            System.out.print(d[i]);
        }
        System.out.println("");
        //
    }
}
