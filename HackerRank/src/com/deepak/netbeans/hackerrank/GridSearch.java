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
public class GridSearch {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int searches = in.nextInt();
        
        // Loading data to arrays
        
        for (int k=1; k<=searches; k++) {
            //System.out.println("k:"+k);
            // Loading grid and block array
            
            // Loading grid array
            int grow = in.nextInt();
            int gcol = in.nextInt();
            int[][] grid = new int[grow][gcol];
            in.nextLine();
            for (int i=0; i<grow; i++) {
                String row = in.nextLine();
                String[] nums = row.split("");
                for (int j=0; j<gcol; j++) {
                   grid[i][j] = Integer.parseInt(nums[j+1]);
                   //System.out.println("grid["+i+"]["+j+"]:"+grid[i][j]);
                }
            }
            //
            
            //Loading block array
            int brow = in.nextInt();
            int bcol = in.nextInt();
            
            //if (brow<=grow && bcol<=gcol) {
            int[][] block = new int[brow][bcol];
            in.nextLine();
            for (int i=0; i<brow; i++) {
                String row = in.nextLine();
                String[] nums = row.split("");
                for (int j=0; j<bcol; j++) {
                   block[i][j] = Integer.parseInt(nums[j+1]);
                   //System.out.println("block["+i+"]["+j+"]:"+block[i][j]);
                }
            }
            //

            // Checking block in grid
            String check="NO";
            outerloop:
            for (int i=0; i<grow; i++) {
                for (int j=0; j<gcol; j++) {
                    if (block[0][0] == grid[i][j] ) {
                        check = gridcheck(grid, block, i, j, brow, bcol, grow, gcol);
                        if ("YES".equals(check)) {
                            break outerloop;
                        }
                        //int check = 0;
                        /***
                        for (int m=0; m<brow; m++) {
                            for (int n=0; n<bcol; n++) {
                                if ((m+i)<grow && (n+j)<gcol) {
                                    if (grid[m+i][n+j] == block[m][n]) {
                                        //System.out.print("grid["+(m+i)+"]["+(n+j)+"]:"+grid[m+i][n+j]);
                                        //System.out.println(", block["+m+"]["+n+"]:"+block[m][n]);
                                        //System.out.println("counter:"+counter);
                                        counter++;
                                    }
                                    if (counter == (brow*bcol)) {
                                        System.out.println("YES");
                                        check="YES";
                                    } 
                                } 
                            }
                        }
                        ***/
                    } //else if ((i==grow-1) && (j==gcol-1) && "NO".equals(check)) {
                      //  System.out.println("NO");
                    //}
                }
            }
            if ("NO".equals(check)) {
                System.out.println("NO");
            }
        }
        //
    }

    private static String gridcheck(int[][] grid, int[][] block, int i, int j, int brow, int bcol, int grow, int gcol) {
        String check = "NO";
        int counter = 0;
        for (int m=0; m<brow; m++) {
            for (int n=0; n<bcol; n++) {
                if ((m+i)<grow && (n+j)<gcol) {
                    if (grid[m+i][n+j] == block[m][n]) {
                        //System.out.print("grid["+(m+i)+"]["+(n+j)+"]:"+grid[m+i][n+j]);
                        //System.out.println(", block["+m+"]["+n+"]:"+block[m][n]);
                        //System.out.println("counter:"+counter);
                        counter++;
                    }
                    //if (counter == (brow*bcol)) {
                    //    System.out.println("YES");
                    //    check = "YES";
                    //} 
                } 
            }
        }
        if (counter == brow*bcol) {
            System.out.println("YES");
            check = "YES";
        }
        return check;
        
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
