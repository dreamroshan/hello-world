/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibonacci.using.recursion;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class FibonacciUsingRecursion {

    /**
     * @param args the command line arguments
     */
    static int fibo(int n)
    {
        if(n == 0)
            return 0;
        
        if(n == 1)
            return 1;
        else
            return fibo(n - 1) + fibo(n - 2);
    }
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter fibonacci Term :");
        
        int n = sc.nextInt();
        
        System.out.println("Fibonacci Series is : \n");
        
        for(int i = 0; i < n; i++)
        {
            System.out.print(fibo(i) + "\t");
        }
    }
    
}
