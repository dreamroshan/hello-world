/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package area.of.rectangle;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class AreaOfRectangle {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter the length of Rectangle :");
        double length = scanner.nextDouble();
        
        System.out.println("Enter the width of Rectangle :");
        double width = scanner.nextDouble();
        
        //Area = length * width;
        double area = length *width;
        
        System.out.println("Area of Rectangle is:" + area);
    }
    
}
