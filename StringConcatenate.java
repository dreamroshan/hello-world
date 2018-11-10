/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.concatenate;

/**
 *
 * @author Roshan
 */
public class StringConcatenate {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "Hello";
        String s2 = "FreeIT";
        
        //Concatenation
        String s3 = s1.concat(s2);
        
        System.out.println("s1 = " + s1);
        System.out.println("s2 = " + s2);
        System.out.println("s3 = " + s3);
        
        String s4 = "Hello";
        
        //checking equals
        if((s4.equals(s1)))
        {
            System.out.println("s4 is equal to s1");
        }
        else
        {
            System.out.println("s4 is not equal to s1");
        }
        
    }
    
}
