/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alphabet.pattern.pkg1;

/**
 *
 * @author Roshan
 */
/*A
BB
CCC
DDDD
EEEEE
*/
import java.util.*;
public class AlphabetPattern1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int line,row,col;
        char ch = 'A';
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of lines : ");
        line = scanner.nextInt();
        
        for(row = 1;row<= line;row++)
        {
            for(col = 1;col <= row; col++)
            {
                System.out.print(" "+ch);
            }
            System.out.println();
            ch++;
        }
    }
    
}
