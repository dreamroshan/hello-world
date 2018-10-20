/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package biginteger.example;

/**
 *
 * @author Roshan
 */
import java.math.*;
import java.io.*;
public class BigIntegerExample {

    /**
     * @param args the command line arguments
     */
    public static int f = 0;
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader (new InputStreamReader(System.in));
        System.out.print("Enter any number to find its factorial :");
        f = Integer.parseInt(br.readLine());
        BigInteger fact = fact(f);
        
        System.out.println("fact("+f+") = " + fact);
        System.out.println("fact("+f+").longValue() = " + fact.longValue()) ;
        System.out.println("fact("+f+").intValue() = " +fact.intValue());
        
        int powerOfTwoCount = 0 ;
        
        BigInteger two = BigInteger.valueOf(2);
        
        while(fact.compareTo(BigInteger.ZERO)> 0 && fact.mod(two).equals(BigInteger.ZERO))
        {
            powerOfTwoCount++;
            fact = fact.divide(two);
        }
        System.out.println("fact("+f+")powers of two = "+powerOfTwoCount);
    }
    private static BigInteger fact(long n)
    {
        BigInteger result = BigInteger.ONE;
        for(long i = 2 ; i<=n;i++)
            result = result.multiply(BigInteger.valueOf(i));
        return result;
    }
}
