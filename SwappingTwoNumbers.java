/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapping.two.numbers;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class SwappingTwoNumbers {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int x, y, temp;
        System.out.println("Enter x and y");
        Scanner in = new Scanner(System.in);
        
        x = in.nextInt();
        y = in.nextInt();
        
        System.out.println("Before Swapping\nx = " + x + "\ny = " + y);
        
        temp = x;
        x = y;
        y = temp;
        
        System.out.println("After Swapping \nx = " + x + "\ny = " + y);
    }
    
}
