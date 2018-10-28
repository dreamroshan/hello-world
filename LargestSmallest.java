/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package largest.smallest;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class LargestSmallest 
{

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String args[]) throws Exception 
    {
        // TODO code application logic here
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("\nEnter number of elements: ");
        int num = Integer.parseInt(br.readLine());
        
        int arr[] = new int[num];
        
        System.out.println("\nEnter " + num + " elements: ");
        for(int i = 0; i < num; i++)
        {
            arr[i] = Integer.parseInt(br.readLine());
        }
        for(int i = 0;i <(num - 1);i++)
            for(int j = 0; j<=i;j++)
            {
                if(arr[j] > arr[j + 1])
                {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        System.out.print("\nHighest number: " + arr[num - 1]);
        System.out.print("\nSmallest number:  " + arr[0]);
        System.out.println();
       }
    
        
    }


