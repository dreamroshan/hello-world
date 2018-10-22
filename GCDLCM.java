/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gcdlcm;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class GCDLCM {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the two number: ");
        x = sc.nextInt();
        y = sc.nextInt();
        
        System.out.println("GCD of two numbers is : " + gcd(x, y));
        System.out.println("LCM of two numbers is : " + lcm(x, y));
    }
    
    static int gcd(int x , int y)
    {
        int r = 0 , a , b;
        a = (x > y) ? x : y; //a is greater number
        b = (x < y) ? x : y; //b is smaller number
        
        r = b;
        while(a % b != 0)
        {
            r = a % b;
            a = b;
            b = r;
        }
        
        return r;
    }
    
    static int lcm(int x, int y)
    {
        int a;
        a = (x > y) ? x : y; // a is greater number
        while(true)
        {
            if(a % x == 0 && a % y == 0)
            {
                return a;
            }
            ++a;
        }
    }
}
