/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package string.equals.test;

/**
 *
 * @author Roshan
 */
public class StringEqualsTest {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String s1 = "abc";
        String s2 = s1;
        String s5 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");
        
        System.out.println("== comparison : " + (s1 == s5));
        System.out.println("== comparison :" + (s1 == s2));
        System.out.println("Using equals method : " + s1.equals(s2));
        System.out.println("== comparison : " + (s3 == s4));
        System.out.println("Using equals method : " + s3.equals(s4));
    }
    
}
