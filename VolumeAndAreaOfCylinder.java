/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package volume.and.area.of.cylinder;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class VolumeAndAreaOfCylinder {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double PI = 3.14;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Radius: ");
        double r = sc.nextDouble();
        
        System.out.print("Enter Height: ");
        double h = sc.nextDouble();
        
        double volume = PI * r * r * h ;
        double area = 2 * PI * r * (r + h);
        System.out.println("Volume of Cylinder: " + volume);
        System.out.println("Area of Cylinder: " + area);
    }
    
}
