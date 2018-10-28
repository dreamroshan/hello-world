/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package krishna.murthy.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class KrishnaMurthyNumber {

    /**
     * @param args the command line arguments
     */
    int fact(int n)
    {
        int i, fact = 1;
        for(i = 1; i <= n;i++)
        {
            fact = fact * i;
        }
        return fact;
    }
    public static void main(String[] args)throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        int number = Integer.parseInt(br.readLine());
        
        KrishnaMurthyNumber kmn = new KrishnaMurthyNumber();
        
        if(kmn.isKrishnaMurthy(number))
        {
            System.out.println(number + " is a Krishna Murthy Number");
        }
        else
        {
            System.out.println(number + " is not a Krishna Murthy Number");
        }
    }
    boolean isKrishnaMurthy(int number)
    {
        int temp, k = 0;
        int n = number;
        while(number > 0)
        {
            temp = number % 10;
            k = k + fact(temp);
            number = number / 10;
        }
        return k == n;
    }
    
}
