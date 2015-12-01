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
public class UtopianTree {
    
    public static void main(String args[]){
        Scanner in = new Scanner(System.in);
        int cyc = in.nextInt();

        int h=1;

        for(int i=1; i<=cyc; i++){
            h=1;
            //System.out.println("i:"+i);
            int val = in.nextInt();
            //System.out.println("val:"+val);
            for(int j=1; j<=val; j++){
                //System.out.println("j:"+j);
                while((j%2)==1){
                    //System.out.println("in odd while loop");
                    h = h*2;
                    break;
                }
                while((j%2)==0){
                    //System.out.println("in even while loop");
                    h++;
                    break;
                }
            }
            //System.out.println("out of j loop");
            System.out.println(h);
        }
        
    
    }
}
