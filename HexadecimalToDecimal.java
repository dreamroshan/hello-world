/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package hexadecimal.to.decimal;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class HexadecimalToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter hex no. to convert in Decimal : ");
        String strHexNumber = br.readLine();
        
        /* 
        *to convert hexadecimal number to decimal number use,
        *int parseInt method of Integer wrapper class.
        *
        *Pass 16 as redix second argument.
        */
        
        int decimalNumber = Integer.parseInt(strHexNumber,16);
        System.out.println("Hexadecimal number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);
    }
    
}
