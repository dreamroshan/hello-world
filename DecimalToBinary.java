/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package decimal.to.binary;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class DecimalToBinary {

    /**
     * @param args the command line arguments
     */
    public String toBinary(int n)
    {
        if(n == 0)
        {
            return "0";
        }
        
        String binary = " ";
        while (n > 0)
        {
            int rem = n % 2;
            binary = rem + binary;
            n = n /2;
        }
        
        return binary;
    }
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int decimal = scanner.nextInt();
        
        DecimalToBinary decimalToBinary = new DecimalToBinary();
        String binary = decimalToBinary.toBinary(decimal);
        
        System.out.println("The binary representation is " + binary);
    }
    
}
