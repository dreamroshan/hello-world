/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareroot;

/**
 *
 * @author Roshan
 */
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SquareRoot {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        int number = 0;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.println("Enter a number ");
        
        //read a string entered by user
        String line = br.readLine();
        
        //Handle exception when a string does not contain a number
        
        try
        {
            //Convert a string into number
            number = Integer.parseInt(line);
        }
        catch (NumberFormatException exception)
        {
            System.out.println("Please enter a valid number");
        }
        //Find square root of a number
        double squareRoot = Math.sqrt(number);
        
        //print square root
        System.out.println("Square root of a number " + number + " = " + squareRoot);
    }
    
}
