/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome;

/**
 *
 * @author Roshan
 */
//A palindrome is a word, phrase , number , or other sequence of symbols or elements,
//whose meaning may be interpreted the same way in either forward or reverse direction.
import java.util.Scanner;
public class Palindrome {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int number = 0;
        int reverse = 0;
        int numCopy = 0;
        
        System.out.println("Enter a number to check if if is a Palindrome");
        
        Scanner in = new Scanner(System.in);
        number = in.nextInt();
        numCopy = number;
        
        while(numCopy > 0)
        {
            int digit = numCopy % 10;
            numCopy = numCopy / 10;
            reverse = (reverse * 10) + digit;
        }
        
        if(number == reverse)
            System.out.println("The number " + number + " is a Palindrome.");
        else
            System.out.println("The number " + number + " is not a Palindrome.");
    }
    
}
