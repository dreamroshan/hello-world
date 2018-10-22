/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package compare.two.strings;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class CompareTwoStrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 , s2;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter the first string");
        s1 = in.nextLine();
        
        System.out.println("Enter the second string");
        s2 = in.nextLine();
        
        if(s1.compareTo(s2) > 0)
            System.out.println("First string is greater than second.");
        else if(s1.compareTo(s2) < 0)
            System.out.println("First string is greater than second.");
        else
            System.out.println("Both strings are equal.");
    }
    
}
