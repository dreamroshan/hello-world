/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package celsius.to.fahrenheit;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class CelsiusToFahrenheit {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double temperature;
        Scanner in = new Scanner(System.in);
        
        System.out.println("Enter temperature in Celsius");
        temperature = in.nextInt();
        
        temperature = (temperature * 9  / 5.0) + 32;
        System.out.println("Temperature in Fahrenheit = " + temperature);
    }
    
}
