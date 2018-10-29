/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package common.numbers.between.two.arrays;

/**
 *
 * @author Roshan
 */
public class CommonNumbersBetweenTwoArrays {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        int[] arr1 = {1,3,7,8};
        int[] arr2 = {9,5,7,2,1,4,8};
        
        System.out.println("Common Elements are:");
        
        for(int i=0; i < arr1.length;i++)
        {
            int j;
            for(j = 0;j < arr2.length;j++)
            {
                if(arr1[i] == arr2[j])
                {
                    System.out.println(arr1[i]);
                }
            }
        }
    }
    
}
