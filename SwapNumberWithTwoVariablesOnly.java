/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap.number.with.two.variables.only;

/**
 *
 * @author Roshan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class SwapNumberWithTwoVariablesOnly {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int a = 10;
        int b = 15;
        
        System.out.println("Values before swipe : ");
        System.out.println("a=" + a + " and b=" + b);
        
        //------Method 1 Using add and substract -----
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("---- Using Method 1 ----");
        System.out.println("a=" + a + " and b=" + b);
        
        //------Method 2 Using XOR operation------
        
        a = 10;
        b = 15;
        
        a = a ^ b;
        b = a ^ b;
        a = a ^ b;
        
        System.out.println("---- Using Method 2 ----");
        System.out.println("a=" + a + "and b=" + b);
        
        //Method 3 Using Multiplicatoin and division----
        
        a = 10;
        b = 15;
        
        a = a * b;
        b = a / b;
        a = a / b;
        
        System.out.println(" ---- Using Method 3 ----");
        System.out.println("a=" + a + " and b=" + b);
        
        //-----Method 4 Using formula a=b-a+(b=a)-----
        
        /*
        Working of Formula:
        System first evaluates (b=a) expression based on BODMAS rule
        then b-a expression
        So a=15-10+(10)=15 and b=10
        */
        
        a = 10;
        b = 15;
        
        a = b -a + (b = a);
        
        System.out.println("----Using Method 4----");
        System.out.println("a=" + a + " and b=" + b);
    }
    
}
