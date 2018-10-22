/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buzz.number;

/**
 *
 * @author Roshan
 */
/*Buzz number is such a number which is either completely divisible by 7 or extreme
right side digit of the number is 7 */
import java.io.*;
public class BuzzNumber {

    /**
     * @param args the command line arguments
     */
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int a;
    public void show() throws Exception
    {
        System.out.print("Enter the number: ");
        a = Integer.parseInt(br.readLine());
        /* Checks if the entered number is divisible by 7 or extreme right is 7*/
        if(a % 10 == 7 || a % 7 == 0)
            System.out.println("Entered number is a Buzz number.");
        else
            System.out.println("Entered number is not a Buzz number.");
    }
    public static void main(String args[]) throws Exception {
        // TODO code application logic here
        BuzzNumber bn = new BuzzNumber();
        bn.show();
        }   
    }
        
       