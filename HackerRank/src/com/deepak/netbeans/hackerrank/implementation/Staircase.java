/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank.implementation;

/**
 *
 * @author ghm8mog
 */
import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Staircase {
    
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int lines = in.nextInt();
        for(int i=1; i<=lines; i++){
            for(int j=1; j<=lines-i; j++){
                System.out.print(" ");
            }
            for(int k=1; k<=i; k++){
                System.out.print("#");
            }
            System.out.println();
        }
    }
    
}
