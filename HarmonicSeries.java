/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package harmonic.series;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class HarmonicSeries {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int num, i = 1;
        double rst = 0.0;
        
        Scanner in = new Scanner(System.in);
        System.out.println("Enter the number for length of series");
        num = in.nextInt();
        
        while(i <= num)
        {
            System.out.print("1/" + i + "+");
            rst = rst + (double) 1/i;
            
            i++;
        }
        
        System.out.println("\n\nSum of Harmonic Series is " + rst);
    }
    
}
