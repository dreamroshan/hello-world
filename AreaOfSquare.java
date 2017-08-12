/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.square;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class AreaOfSquare {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int side,area;
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter value of the sides of square");
        side = sc.nextInt();
        
        area = side*side;
        
        System.out.println("Area of Square:"+area);
    }
    
}
