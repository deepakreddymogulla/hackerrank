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
public class Cavity {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String[][] map = new String[n][n];
        
        int[] m = new int[n];
        in.nextLine();
        
        // Loading the values into the map
        for (int i=0; i<n; i++) {
            String cline = in.nextLine();
            String[] nums = cline.split("");
            for (int j=0; j<n; j++) {
                map[i][j] = nums[j+1];
            }
        }
        
        // Finding cavity value
        //int[] ith = new int[n];
        //int[] jth = new int[n];
        int[][] chk = new int[n][n];
        //ith [0] = -1; jth[0] = -1;
        //ith[n-1] = -1; jth[n-1] = -1;
        for (int i=1; i<(n-1); i++) {
            for (int j=1; j<(n-1); j++) {
                if ((Integer.parseInt(map[i][j]) > Integer.parseInt(map[i-1][j])) && (Integer.parseInt(map[i][j]) > Integer.parseInt(map[i+1][j])) && (Integer.parseInt(map[i][j]) > Integer.parseInt(map[i][j-1])) && (Integer.parseInt(map[i][j]) > Integer.parseInt(map[i][j+1]))) {
                    //ith[i] = i;
                    //jth[i] = j;
                    chk[i][j] = 1;
                }
            }
        }
        //
        
        // Marking cavities
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                //if ((ith[i] == i) && (jth[i] == j)) {
                //    System.out.print("X");
                //}
                if (chk[i][j] == 1) {
                    System.out.print("X");
                }
                else {
                System.out.print(map[i][j]);
                }
            }
            System.out.println();
        }
        //
    }
}
