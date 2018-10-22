/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pythagorean.triplet;

/**
 *
 * @author Roshan
 */
/*Pythagorean Triplet:
c*c = a*a + b*b
*/
public class PythagoreanTriplet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Pythagorean Triplet: ");
        for(int a = 1; a <= 50 ; a++)
        {
            for(int b = 1; b <=50 ; b++)
            {
                int csquared = a * a + b * b;
                double croot = Math.sqrt(csquared);
                
                if(croot == Math.ceil(croot))
                {
                    System.out.println(a + " " + b + " " + (int) croot);
                }
            }
        }
    }
    
}
