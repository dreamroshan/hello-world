/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reverse.of.a.string;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class ReverseOfAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String original, reverse = "";
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter a string to reverse");
        original = in.nextLine();
        
        int length = original.length();
        
        for(int i = length - 1;i >= 0; i--)
        {
            reverse = reverse + original.charAt(i);
        }
        System.out.println("Reverse of entered string is: " + reverse);
    }
    
}
