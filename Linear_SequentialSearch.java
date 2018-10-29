/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linear_sequential.search;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class Linear_SequentialSearch {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int c, n ,search, array[];
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter number of elements");
        n = in.nextInt();
        array = new int[n];
        
        System.out.println("Enter " + n + "integers");
        
        for(c = 0; c < n;c++)
        {
            array[c] = in.nextInt();
        }
        System.out.println("Enter value to find");
        search = in.nextInt();
        
        for(c = 0; c < n; c++)
        {
            if(array[c] == search)  //Searching element is present
            {
                System.out.println(search + " is present at location " + (c + 1)+ " .");
            }
        }
        if(c == n)//Searching element is absent
            System.out.println(search + " is not present in array.");
    }
    
}
