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
public class ACMICPCTeam {
    
    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int t = in.nextInt();
        
        in.nextLine();
        int[][] a = new int[n][t];   
        for(int i = 0; i < n; i++){
            int[] line = new int[t];
            String nums = in.nextLine();
            for(int j = 0; j < nums.length(); j++){
                line[j] = Integer.parseInt(nums.charAt(j) + "");
            }
            a[i] = line;
        }
        
        // Checking for highest knowlegable team and max teams
        int k = -1;
        int teams = 0; 

        for(int i = 0; i < a.length-1; i++){
            for(int j = i+1; j < a.length; j++){
                int knowledge = 0;
                for(int m = 0; m < t; m++){
                    knowledge += (a[i][m] == 1 || a[j][m] == 1) ? 1 : 0;
                }
                if(knowledge > k){
                    k = knowledge;
                    teams = 1;
                }
                else if(knowledge == k){
                    teams += 1;
                }
            }
        }
        System.out.println(k);
        System.out.println(teams);
        //
    }
}
