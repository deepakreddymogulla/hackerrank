/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.warmup;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class AVeryBigSum {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        //int[] a = new int[len];
        long sum = 0;
        for (int i=0; i<len; i++){
            sum = sum + in.nextInt();
        }
        System.out.println(sum);
    }
}
