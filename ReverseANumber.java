/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.a.number;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class ReverseANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int reverse = 0, number = 0;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number to Reverse:");
        number = sc.nextInt();
        sc.close();
        while(number != 0)
        {
            reverse = (reverse * 10) + (number % 10);
            number = number /10;
                   
        }
        System.out.println("Result: " + reverse);
    }
    
}
