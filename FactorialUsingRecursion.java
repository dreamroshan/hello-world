/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factorial.using.recursion;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class FactorialUsingRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int a;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no. for factorial : ");
        a = scanner.nextInt();
        System.out.println("Factorial of " + a + " is " + fact(a));
    }
    static int fact(int n)
    {
        int result;
        if(n == 0 || n == 1)
            return 1;
        result = fact(n - 1) * n ;
        return result;
    }
    
}
