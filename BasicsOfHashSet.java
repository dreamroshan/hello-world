/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics.of.hashset;

/**
 *
 * @author Roshan
 */
import java.util.HashSet;
public class BasicsOfHashSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashSet<String> hs = new HashSet<String>();
        hs.add("Java");
        hs.add("Android");
        hs.add("Php");
        hs.add("Ajax");
        
        System.out.println(hs);
            
            hs.add("Python");
            System.out.println(hs);
            
            //Can't add duplicate
            System.out.println("Is Java added : "+hs.add("Java"));
            
            //remove from HashSet
            hs.remove("Php");
            
            //Size of HashSet
            System.out.print("Size of ArrayList after removing Php :"+hs.size());
            System.out.println();
            
            System.out.println("Is java is in list :"+hs.contains("Java"));
            
            //HashSet to array
            Object[] a=hs.toArray();
            
            System.out.print("Array : ");
            for(Object object : a)
            {
                System.out.print(object+" ");
            }
            System.out.println();
            
            //clear whole HashSet
            hs.clear();
            System.out.print(hs+" "+" Is HashSet empty after clear : "+hs.isEmpty());
    }
    
}
