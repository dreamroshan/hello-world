/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package random.number;

/**
 *
 * @author Roshan
 */
//Generate random number in between the given value
import java.util.*;
public class RandomNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Random r = new Random();
        
        //Printing 10 Random number between 0 to 1000
        for(int i = 0; i < 9; i++)
        {
            System.out.println(r.nextInt(1000));
        }
    }
    
}
