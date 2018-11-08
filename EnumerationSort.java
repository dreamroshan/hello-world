/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package enumeration.sort;

/**
 *
 * @author Roshan
 */
import java.util.*;
public class EnumerationSort {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        Creates random data for sorting source.Will use java.util.Vector
        to store the random integer generated.
        */
        Random random = new Random();
        Vector<Integer> data = new Vector<Integer>();
        
        for(int i = 0; i < 10; i++)
        {
            data.add(Math.abs(random.nextInt()));
        }
        /* 
        Get the enumeration from the vector object and convert it into a java.util.list.
        Finally we sort the list using Collections.sort()
method. */
        Enumeration enumeration = data.elements();
        List<Integer> list = Collections.list(enumeration);
        Collections.sort(list);
        //
        //Prints out all generated number after sorted.
        //
        for(Integer number : list)
        {
            System.out.println("number = " + number);
        }
        
    }
    
}
