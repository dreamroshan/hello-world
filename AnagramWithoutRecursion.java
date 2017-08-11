/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package anagram.without.recursion;

/**
 *
 * @author Roshan
 */
import java.io.*;

public class AnagramWithoutRecursion {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args)throws Exception {
        // TODO code application logic here
        AnagramWithoutRecursion a = new AnagramWithoutRecursion();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        System.out.print("Enter first string :");
        String str1 = br.readLine();
        
        System.out.print("Enter second string:");
        String str2 = br.readLine();
        
        int flag = a.Anagram(str1,str2);
        
        if(flag ==0)
        {
            System.out.print("\nResult: "+str1+"and "+str2+" are anagrams.");
        }
        else
        {
          System.out.print("\nResult: "+str1+" and "+str2+" are not anagrams.");
            
        } 
        System.out.println();
    }
    public int Anagram(String str1,String str2)
    {
        if(str1.equals(str2))
        {
            return 0;
        }
        return 1;
    }
}

    
    

