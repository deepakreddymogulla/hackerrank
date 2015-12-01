/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.deepak.netbeans.hackerrank;

import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author ghm8mog
 */
public class ExtraLongFactorial {
    
    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        BigInteger count = new BigInteger("1");
        //BigInteger i = num;
        
        String f = factorial(num, count);
        System.out.println(f);
    }

    private static String factorial(int num, BigInteger count) {
        //BigInteger i = num;
        for (int i=1; i<=num; i++) {
            count = count.multiply(new BigInteger(i + ""));
        }
        return count.toString();
        //throw new UnsupportedOperationException("Not yet implemented");
    }
}
