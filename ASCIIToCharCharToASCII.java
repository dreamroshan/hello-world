/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ascii.to.pkgchar.pkgchar.to.ascii;

/**
 *
 * @author Roshan
 */
public class ASCIIToCharCharToASCII {

    /**
     * @param args the command line arguments
     */
    public static int CharToASCII(final char character)
    {
        return (int)character ;
    } 
    public static char ASCIIToChar(final int ascii)
    {
        return (char)ascii;
    }        
    
    public static void main(String[] args) {
        // TODO code application logic here
        char a = 'a';
        int i = 65;
        
        System.out.println("Char to ASCII:"+a+" ascii is"+CharToASCII(a));
        System.out.println("ASCII to char:"+i+" char is"+ASCIIToChar(i));
    }
    
}
