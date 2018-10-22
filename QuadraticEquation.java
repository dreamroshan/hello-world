/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quadratic.equation;



/**
 *
 * @author Roshan
 */
public class QuadraticEquation {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        *Suppose our Quadratic Equation to be solved is 2x2 + 6x + 4 = 0.
        *(Assuming that both roots are real values)
        *
        *General form of a Quadratic Equation is ax2 + bx + c = 0 where 'a' is
        *not equal to 0
        *
        *Hence a = 2, b = 6 and c = 4.
        */
        
        int a = 2;
        int b = 6;
        int c = 4;
        
        //Finding out the roots
        double temp1 = Math.sqrt(b * b - 4 * a * c);
        
        double root1 = (-b + temp1) / (2 * a);
        double root2 = (-b - temp1) / (2 * a);
        
        System.out.println("The roots of the Quadratic Equation \"2x2 + 6x + 4 = 0\" are " + root1 + " and " + root2 );
        
    }
    
}
