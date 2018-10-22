/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.to.decimal;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class BinaryToDecimal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception {
        // TODO code application logic here7
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter Binary no. to convert in Decimal : ");
        String number = br.readLine();
        
        /*
            to convert Binary number to decimal number use,
            int parseInt method of Integer wrapper class.
        
            Pass 2 as redix second argument.
        */
        
        int decimalNumber = Integer.parseInt(number , 2);
        System.out.println("Binary number converted to decimal number");
        System.out.println("Decimal number is : " + decimalNumber);
    }
    
}
