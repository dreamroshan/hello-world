/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.length.trim;

/**
 *
 * @author Roshan
 */
public class StringLengthTrim {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = " Universe ";
        System.out.println("s1 = " + s1);
        
        //Display String Length
        System.out.println("The length of s1 is : " + s1.length());
        
        //Removing extra spaces from s1
        String s2 = s1.trim();
        
        System.out.println("s2 = " + s2);
        System.out.println("The length of s2 is: " + s2.length());
    }
    
}
