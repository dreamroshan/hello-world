/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package niven.number;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class NivenNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter a number : ");
        int n = sc.nextInt();
        
        int c = n , d, sum = 0;
        
        //finding sum of digits
        while(c > 0)
        {
            d = c % 10;
            sum = sum + d ;
            c = c / 10;
        }
        if(n % sum == 0)
            System.out.println("\n " + n + " is a Niven Number.");
        else
            System.out.println("\n" + n + " is not a Niven Number.");
    }
    
}
