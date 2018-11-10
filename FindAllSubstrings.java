/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package find.all.substrings;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class FindAllSubstrings {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String string, sub;
        int i,c,length;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter a string to print it's all substrings");
        string = in.nextLine();
        
        length = string.length();
        
        System.out.println("sybstrubgs of \" + string + "\" are :-");
        
        for(c = 0; c < length;c++)
        {
            for(i = 1; i<= length - c ; i++)
            {
                sub = string.substring(c,c + i);
                System.out.println(sub);
            }
        }
    }
    
}
