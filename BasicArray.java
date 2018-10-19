/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basic.array;

import java.util.Scanner;

/**
 *
 * @author Roshan
 */
public class BasicArray {

    /**
     * @param args the command line arguments
     */
  
    
    public static void main(String[] args) {
        // TODO code application logic here
        int[] arr;
        int size , i ;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter size of array");
        size = sc.nextInt();
        
        arr = new int[size];
        
        System.out.println("\nEnter array elements");
        for(i = 0;i < size; i++)
        {
            arr[i] = sc.nextInt();
        }
        
        System.out.println("\nElements in the Array are :");
        for(i = 0; i < size; i++)
        {
            System.out.print(arr[i] + " ");
        }
        
    }
  } 

