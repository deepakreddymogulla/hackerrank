/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank;

import java.util.Scanner;

        //throw new UnsupportedOperationException("Not yet implemented");
    
/**
 *
 * @author ghm8mog
 */
public class SherLock {
    
    public static void main(String args[]){
        
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        
        for(int i=1; i<=num; i++){
            //System.out.println("i:"+i);
            int k = in.nextInt();
            
            if (k==3 || k==5 || k>=8){
                getCode(k);
            } else System.out.println("-1");
            
            
        } 
   }

    private static void getCode(int k) {
        
        switch(k){
            case 3: 
                System.out.println("555");
                break;
            case 5:
                System.out.println("33333");
                break;
            default:
                if (k>=8) {
                int k1 = k/8;
                int k2 = k%8;
                getActualCode(k1, k2);
            }
        }
        
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void getActualCode(int k1, int k2) {
        String out = "";
        
        if(k2==0 || (k2%3)==0 || (k2%5)==0){
            if(k2==0){
                getRoutine(k1, out);
            } else if(k2%3==0){
                for(int i5=1; i5<=(k2/3); i5++){
                        out = out+"555";
                    }
                getRoutine(k1, out);
            } else {
                for(int i3=1; i3<=(k2/5); i3++){
                        out = out+"33333";
                    }
                getRoutine(k1, out);
            }
            
        } else {
            getRoutine(0, "-1");
        }
    }

    private static void getRoutine(int k1, String out) {
        
        for(int i5=1; i5<=k1; i5++){
            out = "555"+out;
        }
        for(int i3=1; i3<=k1; i3++){
            out = out+"33333";
        }
        
        System.out.println(out);
        //throw new UnsupportedOperationException("Not yet implemented");
    }

}
