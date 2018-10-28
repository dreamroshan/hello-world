/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factors.of.integer;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class FactorsOfInteger {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[])throws IOException {
        // TODO code application logic here
        BufferedReader buf = new BufferedReader(new InputStreamReader(System.in));
        int a, i;
        
        System.out.print("Enter the number : ");
        a = Integer.parseInt(buf.readLine());
        System.out.print("\n");
        
        System.out.print("The factors are : ");
        for(i = 1; i <= a / 2; i++)
        {
            if(a % i == 0)
                System.out.print(i + " , ");
        }
        System.out.print(a);
    }
    
    
}
