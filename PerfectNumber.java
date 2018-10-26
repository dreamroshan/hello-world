/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package perfect.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class PerfectNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        int n, s = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter a number : ");
        n = Integer.parseInt(br.readLine());
        
        for(int x = 1;x < n; x++)
        {
            if(n % x == 0)
                s = s + x;
        }
        if(s == n)
            System.out.println("It is perfect number");
        else
            System.out.println("It is not perfect number");
    }
    
}
