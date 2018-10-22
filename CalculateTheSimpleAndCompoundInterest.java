/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.the.simple.and.compound.interest;

/**
 *
 * @author Roshan
 */
import java.lang.*;
import java.util.Scanner;
public class CalculateTheSimpleAndCompoundInterest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double p,n,r,si,ci;
        
        Scanner s = new Scanner(System.in);
        
        System.out.print("Enter the amount : ");
        p = s.nextDouble();
        
        System.out.print("Enter the No.of years : ");
        n = s.nextDouble();
        
        System.out.print("Enter the Rate of interest : ");
        r = s.nextDouble();
        
        si = (p * n * r) / 100;
        ci = p * Math.pow(1.0 + r / 100.0 , n) - p ;
        
        System.out.println("\nAmount : " + p);
        System.out.println("No. of years : " + n);
        System.out.println("Rate of interest : " + r);
        System.out.println("Simple Interest : " + si);
        System.out.println("Compound Interest : " + ci);
    }
    
}
