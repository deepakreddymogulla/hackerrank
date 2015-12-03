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
public class TimeInWords {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int hr = in.nextInt();
        int min = in.nextInt();
        
        if (min>30) {
            if (hr == 12) {
                String attachhr = getHr(1);
                String attachmin = getMin(60-min);
                printString (attachhr, attachmin, 60);
                return;
            } else {
            String attachhr = getHr(hr+1);
            String attachmin = getMin(60-min);
            printString (attachhr, attachmin, 60);
            return;
            }
        } else {
            String attachhr = getHr(hr);
            String attachmin = getMin(min);
            printString (attachhr, attachmin, min);
        }
        
    }

    private static String getMin(int min) {
        String attach1 = null;
        switch (min) {
            case 0: attach1 = "o' clock"; break;
            case 1: attach1 = "one minute"; break;
            case 2: attach1 = "two minutes"; break;
            case 3: attach1 = "three minutes"; break;
            case 4: attach1 = "four minutes"; break;
            case 5: attach1 = "five minutes"; break;
            case 6: attach1 = "six minutes"; break;
            case 7: attach1 = "seven minutes"; break;
            case 8: attach1 = "eight minutes"; break;
            case 9: attach1 = "nine minutes"; break;
            case 10: attach1 = "ten minutes"; break;
            case 11: attach1 = "eleven minutes"; break;
            case 12: attach1 = "twelve minutes"; break;
            case 13: attach1 = "thirteen minutes"; break;
            case 14: attach1 = "fourteen minutes"; break;
            case 15: attach1 = "quarter"; break;
            case 16: attach1 = "sixteen minutes"; break;
            case 17: attach1 = "seventeen minutes"; break;
            case 18: attach1 = "eighteen minutes"; break;
            case 19: attach1 = "nineteen minutes"; break;
            case 20: attach1 = "twenty minutes"; break;
            case 21: attach1 = "twenty one minutes"; break;
            case 22: attach1 = "twenty two minutes"; break;
            case 23: attach1 = "twenty three minutes"; break;
            case 24: attach1 = "twenty four minutes"; break;
            case 25: attach1 = "twenty five minutes"; break;
            case 26: attach1 = "twenty six minutes"; break;
            case 27: attach1 = "twenty seven minutes"; break;
            case 28: attach1 = "twenty eight minutes"; break;
            case 29: attach1 = "twenty nine minutes"; break;
            case 30: attach1 = "half past"; break;
            default: attach1 = "something is wrong";
        }
        return attach1;
        
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    private static String getHr(int hr) {
        String attach2 = null;
        switch (hr) {
            case 1: attach2 = "one"; break;
            case 2: attach2 = "two"; break;
            case 3: attach2 = "three"; break;
            case 4: attach2 = "four"; break;
            case 5: attach2 = "five"; break;
            case 6: attach2 = "six"; break;
            case 7: attach2 = "seven"; break;
            case 8: attach2 = "eight"; break;
            case 9: attach2 = "nine"; break;
            case 10: attach2 = "ten"; break;
            case 11: attach2 = "eleven"; break;
            case 12: attach2 = "twelve"; break;
       }
       return attach2;
        //throw new UnsupportedOperationException("Not yet implemented");
    }

    private static void printString(String attachhr, String attachmin, int check) {
        if (check == 60) {
            System.out.println(attachmin+" to "+attachhr);
            return;
        } else if (check == 00) {
            System.out.println(attachhr+" "+attachmin);
            return;
        } else if (check == 30) {
            System.out.println(attachmin+" "+attachhr);
        } else {
            System.out.println(attachmin+" past "+attachhr);
        }
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
