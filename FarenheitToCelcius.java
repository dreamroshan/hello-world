/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package farenheit.to.celcius;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class FarenheitToCelcius {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float temperature;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Enter temperature in Fahrenheit : ");
        temperature = in.nextInt();
        
        temperature = (temperature - 32) * 5/9;
        
        System.out.println("Temperature in Celcius = " + temperature);
    }
    
}
