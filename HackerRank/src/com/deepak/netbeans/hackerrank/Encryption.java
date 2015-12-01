/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank;

import java.lang.Math.*;
import java.util.Scanner;
/**
 *
 * @author ghm8mog
 */
public class Encryption {
    
    public static void main(String args[]) {
        
        // Get the required parameters
        Scanner in = new Scanner(System.in);
        //in.nextLine();
        String string = in.nextLine();
        //System.out.println("string:"+string);
        int slen = string.length();
        //System.out.println("string len:"+slen);
        //int i = 27;
        double s = Math.sqrt(slen);
        int f = (int) Math.floor(s);
        int c = (int) Math.ceil(s);
        //System.out.println("f:"+f);
        //System.out.println("c:"+c);
        String[] nums = string.split("");
        //
        int[] d = new int[2];
        // Get row and column
        d = determineDimensions(f,c,slen);
        //
        
        // Form and print the matrix
        formMatrix(nums,d);
    }

    private static int[] determineDimensions(int f, int c, int slen) {
        
        int[] d = new int[2];
        // Checking for non-zero ints 
        if (f>0 && c>0) {
            //Determine row and column loop
            outerloop:
            for (int i=f; i<=c; i++) {
                for (int j=f; j<=c; j++) {
                    if ((i*j)>=slen) {
                        if ((i>=f) && (j<=c) && (i<=j)) {
                            d[0] = i;
                            d[1] = j;
                            //System.out.println("d[0]:"+d[0]);
                            //System.out.println("d[1]:"+d[1]);
                            break outerloop;
                        }
                    }
                }
            }
            //
        } else {
            System.out.println("Matrix not possible");
        }
        
        return d;
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void formMatrix(String[] nums, int[] d) {
        int counter = 1;
        int check = nums.length;
        String[][] matrix = new String[d[0]][d[1]];
        // Forming the matrix
        for (int i=0; i<d[0]; i++) {
            for (int j=0; j<d[1]; j++) {
                if (counter<check) {
                    matrix[i][j] = nums[counter];
                    //System.out.print(matrix[i][j]);
                    counter++;
                }
            }
            //System.out.println();
        }
        //
        printMatrix(matrix,d);
        
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void printMatrix(String[][] matrix, int[] d) {
        
        // Printing the output
        //System.out.println();
        for (int i=0; i<d[1]; i++) {
            for (int j=0; j<d[0]; j++) {
                if (matrix[j][i] != null) {
                    System.out.print(matrix[j][i]);
                }
            }
            System.out.print(" ");
        }
        
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
