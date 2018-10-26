/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hailstone.sequence;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class HailStoneSequence {

    /**
     * @param args the command line arguments
     */
    static Scanner MyScanner = new Scanner(System.in);
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("This program will generate the HailStone sequence.");
        System.out.print("Enter a number: ");
        int num = MyScanner.nextInt();
        while (num > 1)
        {
            if(num % 2 == 0)
            {
                num /= 2; //Dividing num by 2 if it is even
                System.out.print(num + "\t");
            }
            else
            {
                num = (num * 3) + 1; //Adding num*3 + 1 to num if the num is odd
                System.out.print(num + "\t");
            }
                    
        }
    }
    
}
