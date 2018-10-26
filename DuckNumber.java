/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class DuckNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException{
        // TODO code application logic here
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        String n = br.readLine();
        
        int l = n.length();
        int c = 0;
        char ch;
        
        for(int i = 1;i < 1 ; i++)
        {
            ch = n.charAt(i);
            if(ch == '0')
                c++;
        }
        
        char f = n.charAt(0);
        
        if (c > 0 && f!= '0')
            System.out.println("It is a Duck number");
        else
            System.out.println("It is not a duck number");
    }
    
}
