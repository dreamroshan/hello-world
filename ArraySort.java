/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.sort;

/**
 *
 * @author Roshan
 */
import java.util.Arrays;
public class ArraySort {

    /**
     * @param args the command line arguments
     */
    //This program is the example of array sorting
    public static void main(String[] args) {
        // TODO code application logic here
        //initializing unsorted array
        String iArr[] = {"Programming","Hub","Alice","Wonder","Land"};
        
        //sorting array
        Arrays.sort(iArr);
        
        //let us print all the elements available in list
        System.out.println("The sorted array is : ");
        for(int i = 0; i< iArr.length;i++)
        {
            System.out.println(iArr[i]);
        }
    }
    
}
