/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package automorphic.numbers;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class AutomorphicNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int input = scanner.nextInt();
        
        int square = input * input ;
        
        String inputAsString = input + " ";
        String squareAsString = square + " ";
        
        if(squareAsString.endsWith(inputAsString))
        {
            System.out.println(input + " is Automorphic Number ");
            
        }
        else
        {
            System.out.println(input+"is Not an Automorphic number");
        }
        
    }
    
}
