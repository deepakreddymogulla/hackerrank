/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/**
 *
 * @author ghm8mog
 */
public class DiagonalDifference {
    
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int rows = in.nextInt();
    //    System.out.println("rows: "+ rows);
        int[][] a = new int[rows][rows];
        int fsum = 0;
        int bsum = 0;
       // while(in.next() != null){
        for(int i=0; i<rows; i++){
            for(int j=0; j<rows; j++){
                a[i][j] = in.nextInt();
            }
            fsum = fsum + a[i][i];
            bsum = bsum + a[i][rows-i-1];
        }
       // }
        for(int i=0;i<rows;i++){
            for(int j=0;j<rows;j++){
                System.out.print(a[i][j]+" ");
            }
            System.out.println();
        }
        System.out.println(fsum);
        System.out.println(bsum);
     //   int diff = fsum - bsum;
        System.out.println(Math.abs(fsum - bsum));
       
    } 
    
    
    
}
