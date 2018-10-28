/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.perfect.square.number.within.a.range;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class FindPerfectSquareNumberWithinARange {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int start, end, n ,sum = 0;
        float s;
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter starting value of the range");
        start = sc.nextInt();
        
        System.out.println("Enter ending value of the range");
        end = sc.nextInt();
        
    System.out.println(" The Perfect Square numbers present in the range " + start + " to " + end + " are :");
    
    for(int i = start; i < end ; i++)
    {
        s = (float) Math.sqrt(i);
        n = (int)Math.floor(s);
        
        if(s == n)
        {
            System.out.print(" " + i);
            sum += i ;
        }
    }
    System.out.println("\nSum of the perfect square numbers between the range " + start + " to " + end + " are :" +sum);
                
    }
    
}
