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
public class SimpleArraySum {
    
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int[] a;
        a = new int[len];
        int sum = 0;
        for (int i=0; i<len; i++){
            a[i] = in.nextInt();
            sum = sum+a[i];
        }
        System.out.println(sum);
        
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
    }
}
