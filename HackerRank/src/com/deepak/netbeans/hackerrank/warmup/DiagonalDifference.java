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
public class DiagonalDifference {
    
    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
        int[][] a = new int[rows][rows];
        int fsum = 0;
        int bsum = 0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                a[i][j] = in.nextInt();
            }
            fsum = fsum + a[i][i];
            bsum = bsum + a[i][rows-i-1];
        }
        System.out.println(Math.abs(fsum - bsum));
    }
}
