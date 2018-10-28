/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lucas.series;

/**
 *
 * @author Roshan
 */
/*In Lucas Series , each subsequent number is the sum of the previous two,and here
the first two numbers are 2 and 1.

*/
import java.util.*;
public class LucasSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num1, num2,limit,add;
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter the limit of elements");
        limit = sc.nextInt();
        
        num1 = 2;
        num2 = 1;
        
        System.out.println("\nLucas Series:");
        while(limit >= num1)
        {
            System.out.print(num1 + " ");
            add = num1 + num2;
            num1 = num2;
            num2 = add;
        }
        
        
    }
    
}
