/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculate.mean;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class CalculateMean {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int sum = 0, inputNum;
        int counter;
        float mean;
        Scanner NumScanner = new Scanner(System.in);
        
        System.out.println("Enter the total number of terms whose mean you want to calculate");
        
        counter = NumScanner.nextInt();
        
        System.out.println("Please enter " + counter + "numbers: ");
        
        for(int x = 1 ; x <= counter ; x++)
        {
            inputNum = NumScanner.nextInt();
            sum = sum + inputNum;
            System.out.println();
        }
        
        mean = sum / counter;
        System.out.println("The mean of the " + counter + " numbers you entered is " + mean);
    }
   }
    

