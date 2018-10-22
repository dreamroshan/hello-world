/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package multiplication.tables;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class MultiplicationTables {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b,c,d;
        System.out.println("Enter range of numbers to print their multiplication table");
        Scanner in = new Scanner(System.in);
        
        a = in.nextInt();
        b = in.nextInt();
        
        for(c = a; c <= b ; c++)
        {
            System.out.println("Multiplication table of " + c);
            
                for(d = 1 ; d <= 10; d++)
                {
                    System.out.println("Multiplication table of " + c);
                    
                    for(d = 1; d <= 10; d++)
                    {
                        System.out.println(c + "*" + d + "=" + (c * d));
                    }
                }
        }
    }
    
}
