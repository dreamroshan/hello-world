/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sorting.array.in.ascending.and.descending.order;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class SortingArrayInAscendingAndDescendingOrder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, i, j, temp;
        int[]asc;
        int[]des;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the number of elements:");
        num = sc.nextInt();
        
        asc = new int[num];
        des = new int[num];
        
        System.out.println("Enter " + num + " numbers: ");
        
        //Sorting numbers in ascending order
        for(i = 0; i < num; i++)
        {
            
            asc[i] = sc.nextInt();
            des[i] = asc[i];
        }
        for(i = 0;i <(num - 1);i++)
        {
            for(j = 0;j <(num - i - 1);j++)
            {
                if(asc[j] > asc[j + 1])
                {
                    temp = asc[j];
                    asc[j] = asc[j + 1];
                    asc[j + 1] = temp;
                }
            }
        }
        //Sorting numbers in descending order
        for(i = 0; i <(num -1); i++)
        {
            for(j = 0;j < (num - i - 1);j++)
            {
                if(des[j] < des[j + 1])
                {
                    temp = des[j];
                    des[j] = des[j + 1];
                    des[j + 1] = temp;
                }
            }
        }
        System.out.println("Sorted list of numbers in ascending order:");
        for(i = 0; i < num ; i++)
        {
            System.out.print(" " + asc[i]);
        }
        System.out.println("\n \nSorted list of numbers in descending order:");
        for(i = 0;i < num;i++)
        {
            System.out.print(" " + des[i]);
        }
    }
    
}
