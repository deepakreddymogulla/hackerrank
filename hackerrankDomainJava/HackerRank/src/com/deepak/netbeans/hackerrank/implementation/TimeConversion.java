/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

/**
 *
 * @author ghm8mog
 */

import java.util.*;
import java.text.*;

public class TimeConversion {
 
    public static void main(String[] args) throws ParseException{
            
            Scanner in = new Scanner(System.in);
            String time = in.next();           
        //  System.out.print(time);
        //  System.out.print(time.length());
            int len = time.length();
                      
            String ampm = time.substring(len-2);
            System.out.println(ampm);
            if ("AM".equals(ampm)){
                System.out.println("Above condition");
                amMethod(time, len);
            } else if ("PM".equals(ampm)) {
                pmMethod(time, len);
            } else 
                System.out.println(time);
            }
         
    private static void amMethod(String time, int len){
      // System.out.println("In AM method");
        String shour = time.substring(0, 2);
        String sshour;
        int ihour = Integer.parseInt(shour);
        if (ihour == 12){
            sshour = "00";
        } else {
            sshour = shour;
        }
     // System.out.println(time.substring(0, len-2));
        String ftime = sshour + time.substring(2, len-2);
        System.out.println(ftime);
    }

    
    private static void pmMethod(String time, int len) {
        String shour = time.substring(0, 2);
        System.out.println("hour:" + shour);
        int ahour;
        String sshour;
        int ihour = Integer.parseInt(shour);
        if (ihour != 12){
            ahour = ihour + 12;
            sshour = Integer.toString(ahour);
        } else {
            sshour = "12";
        }
        
     // String sshour = Integer.toString(ahour);
        String ftime = sshour + time.substring(2, len-2);
        System.out.println(ftime);
    }
    
    
         
         
    }

