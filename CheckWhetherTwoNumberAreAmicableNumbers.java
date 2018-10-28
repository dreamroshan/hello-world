/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.whether.two.number.are.amicable.numbers;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class CheckWhetherTwoNumberAreAmicableNumbers {

    /**
     * @param args the command line arguments
     */
    static boolean check(int a, int b)
    {
        int s = 0, i;
        for(i = 1; i < a; i++)
        {
            if(a % i == 0)
            {
                s = s + i; 
            }
        }
        if(s == b)
        {
            s = 0;
            for(i = 1; i < b; i++)
            {
                if(b % i == 0)
                {
                    s = s + i ;
                }
            }
            if(s == a)
                return true;
            else
                return false;
        }
        return false;
    }
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter 1st no. : ");
        int a = Integer.parseInt(br.readLine());
        System.out.print("Enter 2nd no. : ");
        int b = Integer.parseInt(br.readLine());
        
        if(check(a , b))
        {
            System.out.print(a + " and " + b + " are Amicable Number");
        }
        else
        {
            System.out.print(a + " and " + b + " are not Amicable Number");
        }
    }
    
}
