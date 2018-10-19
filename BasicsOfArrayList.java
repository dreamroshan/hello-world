/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics.of.arraylist;

/**
 *
 * @author Roshan
 */
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
public class BasicsOfArrayList {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ArrayList<String> al = new ArrayList<String>();
        //adding object in arraylist
        
        al.add("Java");
        al.add("C");
        al.add("C++");
        al.add("php");
        al.add("python");
        al.add("css");
        
        //add
        al.add("html");
        
        //add at specific index
        al.add(1, "Android");
        
        System.out.println("ArrayList :"+al);
        System.out.println();
        
        //remove from arraylist
        al.remove("php");
        
        //Size of ArrayList
        System.out.println("Size of ArrayList after removing php :"+al.size());
        System.out.println();
        
        System.out.println("Is java is in list :"+al.contains("Java"));
        
        //get specific element
        System.out.println("I want "+al.get(0));
        System.out.println();
        
        //list of array
        Object[] a=al.toArray();
        
        System.out.print("Array : ");
        for(Object object : a)
        {
            System.out.print(object+" ");
        }
        System.out.println();
        
        //change element
        al.set(6, "Javascript");
        System.out.print("ArrayList after replace : "+al);
        System.out.println();
        
        //sort list using Collections Class
        Collections.sort(al);
        System.out.print("ArrayList after sort :"+ al);
        System.out.println();
        
        //Index
        System.out.println("Index of Android:"+ al.indexOf("Android"));
        
        //clear whole list
        al.clear();
        System.out.print(al+ " "+"Is list empty after clear : "+al.isEmpty());
    }
    
}
