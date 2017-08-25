/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sum.and.average;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class ArraySumAndAverage {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //define an array
        int[]numbers = new int[]{10,20,15,25,16,60,100};
        
        int sum = 0;
        
        for(int i=0;i<numbers.length;i++)
            sum = sum + numbers[i];
        
        double average = sum / numbers.length;
            System.out.println("Sum of array elements is : " + sum);
            System.out.println("Average value of array elements is : " +average);
    }
    
}
