/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package binary.to.octal;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class BinaryToOctal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        String num = null;
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter binary number: ");
        num = br.readLine();
        int dec = Integer.parseInt(num , 2);
        
        String oct = Integer.toOctalString(dec);
        
        System.out.println("Binary " + num + "in Octal is " + oct);
    }
    
}
