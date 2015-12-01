/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank;

/**
 *
 * @author ghm8mog
 */

import java.util.*;

public class AngryProfessor {
    
    public static void main(String[] args){
        
        Scanner in = new Scanner(System.in);
        int cases = in.nextInt();
        //System.out.println("cases:"+cases);
        
        //int[] b;
        for(int i=0; i<cases; i++){
            //System.out.println("i:"+i);
            int a0 = in.nextInt();
            //System.out.println("a[0]:"+a0);
            int a1 = in.nextInt();
            //System.out.println("a[1]:"+a1);
            in.nextLine();
            String line = in.nextLine();
            //System.out.println("line:"+line);
            String[] nums = line.split(" ");
            int b[] = new int[a0];
            int count = 0;
            for (int j=0; j<a0; j++) {
                //System.out.println("j:"+j);
                //System.out.println("Checking line split..");
                //System.out.println("nums[j]:"+nums[j]);
                //System.out.println("Splitting now..");
                b[j] = Integer.parseInt(nums[j]);
                //System.out.println("b[i]:"+b[i]+1);
                //System.out.println("nums[0]:"+Integer.parseInt(nums[0]));
                if(b[j]<=0){
                    count++;
                }
            }
            //System.out.println("count:"+count);
            //System.out.println("cutoff:"+a1);
            //System.out.println("Calculating count now..");
            if(count>=a1){
                System.out.println("NO");
            } else {
                System.out.println("YES");
            }
        //getInput();
        }
        in.close();
        
    }   
}
