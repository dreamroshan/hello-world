/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.of.a.number;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class FactorialOfANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int fact = 1;
        int number = 0;
        
        System.out.println("Enter a number to print its factorial");
        
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        
        for(int i = 1; i <= number; i++)
        {
            fact = i * fact;
        }
        System.out.println("The factorial of " + number + " is " + fact);
    }
    
}
