/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package greatest.of.n.numbers;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class GreatestOfNNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        // TODO code application logic here
        Scanner data = new Scanner(System.in);
        int num, i ,temp,max;
        
        //Reading numbers want to be read
        System.out.print("Enter the range:");
        num = data.nextInt();
        
        System.out.println("Enter" + num + "number");
        //Reading 1st number
        max = data.nextInt();
        
        //Reading other number
        for(i = 1; i < num; i++)
        {
            temp = data.nextInt();
            if(temp < max)
                continue;
            else
                //largest number
                max = temp;
        }
        System.out.println("Largest Number is " + max);
        
    }
    
}
