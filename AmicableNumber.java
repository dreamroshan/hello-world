/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package amicable.number;

/**
 *
 * @author Roshan
 */
//Amicable Number
import java.util.Scanner;
public class AmicableNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int a,b;
        Scanner in = new Scanner(System.in);
        System.out.println("Enter two Numbers:");
        a = in.nextInt();
        b = in.nextInt();
        boolean flag = check(a,b);
        if(flag)
        {
            System.out.println("The numbers are emicable");
        }
        else
        {
            System.out.println("The numbers are not amicable");
        }
    }
    static boolean check(int a,int b)
    {
        int s=0,i;
        for(i =1;i<a;i++)
        {
               if(a%i==0)
               {
                   s=s+i;
               }
        }if(s==b)
        { s=0;
        for(i=1;i<b;i++)
        {
            if(b%i==0)
            {
                s=s+i;
            }
        }
        if(s==a)
            return true;
        else
            return false;
                
        }
        return false;
    }
}
