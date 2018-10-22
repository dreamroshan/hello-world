/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.number.calculation;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class BinaryNumberCalculation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner in = new  Scanner(System.in);
        
        System.out.print("First Binary: ");
        String binOne = in.next();
        
        System.out.print("Second Binary: ");
        String binTwo = in.next();
        
        int left = Integer.parseInt(binOne,2 );
        int right = Integer.parseInt(binTwo, 2);
        
        System.out.println("Sum of the binary numbers : " + Integer.toBinaryString(left + right));
        System.out.println("Difference of the binary numbers : " + Integer.toBinaryString(left - right));
        System.out.println("Product of the binary numbers : " + Integer.toBinaryString(left * right));
        System.out.println("Quotient of the binary numbers : " + Integer.toBinaryString(left / right));
    }
    
}
