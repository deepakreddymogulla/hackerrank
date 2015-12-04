/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.strings;

import java.util.Scanner;

/**
 *
 * @author ghm8mog
 */
public class Pangrams {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        //in.nextLine();
        String line = in.nextLine();
        String[] nums = line.split("");
        int len = nums.length;
        int[] chk = new int[26];
        int l = line.length();
        int[] b = new int[l+1];
        for (int j=0; j<l; j++) {
            char c = nums[j+1].charAt(0);
            b[j] = (int) c;
            //System.out.println("b["+j+"]:"+b[j]);
            
            switch (b[j]) {
                case 97: chk[0] = 1; break;
                case 98: chk[1] = 1; break;
                case 99: chk[2] = 1; break;
                case 100: chk[3] = 1; break;
                case 101: chk[4] = 1; break;
                case 102: chk[5] = 1; break;
                case 103: chk[6] = 1; break;
                case 104: chk[7] = 1; break;
                case 105: chk[8] = 1; break;
                case 106: chk[9] = 1; break;
                case 107: chk[10] = 1; break;
                case 108: chk[11] = 1; break;
                case 109: chk[12] = 1; break;
                case 110: chk[13] = 1; break;
                case 111: chk[14] = 1; break;
                case 112: chk[15] = 1; break;
                case 113: chk[16] = 1; break;
                case 114: chk[17] = 1; break;
                case 115: chk[18] = 1; break;
                case 116: chk[19] = 1; break;
                case 117: chk[20] = 1; break;
                case 118: chk[21] = 1; break;
                case 119: chk[22] = 1; break;
                case 120: chk[23] = 1; break;
                case 121: chk[24] = 1; break;
                case 122: chk[25] = 1; break;
                
                case 65: chk[0] = 1; break;
                case 66: chk[1] = 1; break;
                case 67: chk[2] = 1; break;
                case 68: chk[3] = 1; break;
                case 69: chk[4] = 1; break;
                case 70: chk[5] = 1; break;
                case 71: chk[6] = 1; break;
                case 72: chk[7] = 1; break;
                case 73: chk[8] = 1; break;
                case 74: chk[9] = 1; break;
                case 75: chk[10] = 1; break;
                case 76: chk[11] = 1; break;
                case 77: chk[12] = 1; break;
                case 78: chk[13] = 1; break;
                case 79: chk[14] = 1; break;
                case 80: chk[15] = 1; break;
                case 81: chk[16] = 1; break;
                case 82: chk[17] = 1; break;
                case 83: chk[18] = 1; break;
                case 84: chk[19] = 1; break;
                case 85: chk[20] = 1; break;
                case 86: chk[21] = 1; break;
                case 87: chk[22] = 1; break;
                case 88: chk[23] = 1; break;
                case 89: chk[24] = 1; break;
                case 90: chk[25] = 1; break;
                    
                default: break;
            }
        }
        
        int counter = 0;
            for (int i=0; i<26; i++) {
                if (chk[i] == 1) {
                    counter++;
                }    
            } 
            
            if (counter == 26) {
                System.out.println("pangram");
            } else {
                System.out.println("not pangram");
            }
    }
    
}
