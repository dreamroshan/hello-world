/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.a.circle;

/**
 *
 * @author Roshan
 */
public class AreaOfACircle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int radius = 3;
        System.out.println("The radius of the circle is " + radius);
        /*
        *Area of a circle is pi*r*r where r is a radius of a circle.
        */
        // NOTE:use Math.PI constant to get value of pi
        double area = Math.PI * radius;
        
       System.out.println("Area of a circle is " + area);
    }
    
}
