/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package keith.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class KeithNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter the number : ");
        
        int n = Integer.parseInt(br.readLine());
        
        int copy = n;
        String s = Integer.toString(n);
        
        //finding the number of digits (d) in the number
        int d = s.length();
        
        //array for storing the terms of the series
        int arr[] = new int[n];
        
        for(int i = d - 1;i >= 0;i--)
        {
            //storing the digits of the number in the array
            arr[i] = copy % 10;
            copy = copy / 10;
        }
        int i = d, sum = 0;
        //finding the sum till it is less than the number
        while(sum < n)
        {
            sum = 0;
            //loop for generating and adding the previous 'd' terms
            for(int j=1;j<=d;j++)
            {
                sum = sum + arr[i - j];
            }
            //storing the sum in the array
            arr[i] = sum;
            i++;
        }
        //if sum is equal to the number , then it is a Keith number
        if(sum == n)
            System.out.println(n + " is a keith Number");
        else
            System.out.println(n + " is a not a Keith Number");
    }
    
}
