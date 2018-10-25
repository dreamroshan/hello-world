/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package neon.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class NeonNumber {

    /**
     * @param args the command line arguments
     * @throws java.io.IOException
     */
    public static void main(String args[]) throws IOException 
    {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int num ;
        int square;
        int sum = 0;
        
        System.out.print("Enter any number : ");
        num = Integer.parseInt(br.readLine());
        square = num * num ;//squaring the number
        
        String sqs = Integer.toString(square);
        for(int i = 0;i < sqs.length() ;i++)
        {
            sum += Integer.parseInt(sqs.substring(i,i + 1));
        }
        if(sum == num)//checking if the sum of the square is equal to the number entered
            System.out.println(num + " is a Neon Number");
        else
            System.out.println(num + " is not a Neon number");
    }
    
}
