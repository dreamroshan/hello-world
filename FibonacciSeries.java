/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.series;

/**
 *
 * @author Roshan
 */
import java.io.*;
import java.lang.*;
public class FibonacciSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        if(args.length == 1)
        {
            int n = Integer.parseInt(args[0]);
            int a = 0, b = 1, c = 0 , i = 0;
            while(i < n)
            {
                System.out.print(c + "\t");
                
                a = b;
                b = c;
                c = a + b;
                i++;
            }
        }
        else
        {
            System.out.println("You havent supplied the arguments:{Usage : java fibonacci 34} to print the first 34 fibonacci numbers. ");
        }
    }
    
}
