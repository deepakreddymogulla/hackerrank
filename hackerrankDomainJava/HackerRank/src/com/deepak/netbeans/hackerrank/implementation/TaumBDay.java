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
public class TaumBDay {
    
    public static void main(String args[]) {
        
        Scanner in = new Scanner(System.in);
        int trys = in.nextInt();
        
        
        for (int i=1; i<=trys; i++) {
            long[] q = new long[2];
            long[] c = new long[3];
            q[0] = in.nextInt();
            q[1] = in.nextInt();
            c[0] = in.nextInt();
            c[1] = in.nextInt();
            c[2] = in.nextInt();
            long c1 = ((q[0]*c[0]) + (q[1]*c[1]));
            long c2 = ((q[0]*c[0]) + (q[1]*(c[0]+c[2])));
            long c3 = ((q[0]*(c[1]+c[2])) + (q[1]*c[1]));
            if ((c1<=c2) && (c1<=c3)) {
                    System.out.println(c1);
            }
            if ((c2<c1) && (c2<=c3)) {
                    System.out.println(c2);
            }
            if ((c3<c2) && (c3<c1)) {
                    System.out.println(c3);
            }
        }
    }
}
            
            /*** BigInteger implementation
            BigInteger c1 = new BigInteger((q[0]*c[0]) + (q[1]*c[1]) + "");
            System.out.println("c1:"+c1);
            BigInteger c2 = new BigInteger((q[0]*c[0]) + (q[1]*(c[0]+c[2])) + "");
            System.out.println("c2:"+c2);
            BigInteger c3 = new BigInteger((q[0]*(c[1]+c[2])) + (q[1]*c[1]) + "");
            System.out.println("c3:"+c3);
            int res = c1.compareTo(new BigInteger("0"));
            System.out.println("res:"+res);
            if (c1.compareTo(new BigInteger("0")) == 1) {
                System.out.println("entered c1");
                if (((c1.compareTo(c2)) == -1) && ((c1.compareTo(c3)) == -1)) {
                    System.out.println("c1 check OK");
                    System.out.println(c1);
                }
            }
            if (c2.compareTo(new BigInteger("0")) == 1) {
                System.out.println("entered c2");
                
                if (((c2.compareTo(c3)) == -1) && ((c2.compareTo(c1)) == -1)) {
                    System.out.println("c2 check OK");
                    System.out.println(c2);
                }
            }
            if ((c3.compareTo(new BigInteger("0")) == -1)) {
                System.out.println("entered c3");
                if ((c3.compareTo(c1)) >= 1 && (c3.compareTo(c2)) >= 1) {
                    System.out.println("C3 check OK");
                    System.out.println(c3);
                }
            }
            ***/
        
