/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package armstrong.number;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class ArmstrongNumber 
{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)
    {
        // TODO code application logic here
        int n,sum = 0,temp,r;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a number to check if it is an armstrong number");
        n = in.nextInt();
        
        temp= n;
        
        while(temp != 0)
        {
            r = temp%10;
            sum = sum + r*r*r;
            temp = temp/10;
        }
        if(n == sum)
            System.out.println("Entered number is an armstrong number.");
        else
            System.out.println("Entered number is not an armstrong number.");
    }
}

    
    

