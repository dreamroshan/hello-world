/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package octal.to.decimal;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class OctalToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Octal no. to convert in Decimal : ");
        String number = br.readLine();
        
        /* 
            to convert Octal number to decimal number use,
            int parseInt method of Integer wrapper class.
        
            Pass 8 as redix second argument.
        */
        
        int decimalNumber = Integer.parseInt(number, 8);
        System.out.println("Octal number converted to decimal number");
        System.out.println("Decimal number is :" + decimalNumber);
    }
    
}
