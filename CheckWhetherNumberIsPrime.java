/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package check.whether.number.is.prime;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class CheckWhetherNumberIsPrime {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int n, i, res;
        boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("please Enter a No. ");
        
        n = sc.nextInt();
        for(i = 2; i<=n / 2;i++)
        {
            res = n % i;
            if(res == 0)
            {
                flag = false;
                break;
            }
        }
        if(flag)
            System.out.println(n + " is Prime Number");
        else
            System.out.println(n + " is not Prime Number");
    }
    
}
