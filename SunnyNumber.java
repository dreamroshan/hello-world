/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sunny.number;

/**
 *
 * @author Roshan
 */
//Sunny Number:when 1 is added to a number,then the square root of it will be a whole number.

import java.util.*;
public class SunnyNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n, n1;
        double x;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter number");
        n = sc.nextInt();
        
        n1 = n + 1;
        x = Math.sqrt(n1);
        
        if((int) x == x)
        {
            System.out.println("Number is a Sunny Number");
        }
        else
        {
            System.out.println("Number is not a Sunny Number");
        }
    }
    
}
