/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcd.og.two.number.using.euclid.s.method;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class GCDOgTwoNumberUsingEuclidSMethod {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //Enter two number whose GCD needs to be calculated.
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter first number to find GCD : ");
        int number1 = scanner.nextInt();
        System.out.print("Enter second number to find GCD : ");
        int number2 = scanner.nextInt();
        
        System.out.println("GCD of two numbers " + number1 + " and " + number2 + "is :" + findGCD(number1,number2));
        
    }
    //find GCD of two number using Euclid's method
    private static int findGCD(int number1 , int number2)
    {
        //base case
        if (number2 == 0)
            return number1;
        
        return findGCD(number2 , number1 % number2);
    }
}
