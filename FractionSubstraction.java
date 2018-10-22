/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fraction.substraction;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class FractionSubstraction {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float a,b,c,d;
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a :");
        a = scanner.nextFloat();
        System.out.print("Enter b :");
        b = scanner.nextFloat();
        System.out.print("Enter c :");
        c = scanner.nextFloat();
        System.out.print("Enter d : ");
        d = scanner.nextFloat();
        
        //fraction addition formula ((a * d) - (b * c)) / (b * d)
        System.out.print("Fraction substration : [("+a+" * "+d+")- ("+b+" * "+c+") / ("+b+" * "+d+")] = "+(((a*d) - (b*c)) / (b*d)));
    }
    
}
