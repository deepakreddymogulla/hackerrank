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
public class FindDigits {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        in.nextLine();
        for(int i=1; i<=lines; i++){
            String line = in.nextLine();
            int digit = Integer.parseInt(line);
            String[] nums = line.split("");
            int len = nums.length-1;
            int count = 0;
            for (int j=1; j<=len; j++) {
                if(Integer.parseInt(nums[j])!=0){
                    if(digit%(Integer.parseInt(nums[j]))==0){
                        count++;
                    }
                }
            }
            System.out.println(count);
        }
    }
    
}
