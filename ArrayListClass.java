/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arraylist.pkgclass;

/**
 *
 * @author Roshan
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayListClass {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //creating arraylist of type String
        
        ArrayList<String> a1=new ArrayList<String>();
        //adding object in arraylist
        
        a1.add("Java");
        a1.add("C");
        a1.add("C++");
        a1.add("php");
        
        System.out.println("ArrayList :" +a1);
        System.out.println();
        
            //getting Iterator from arraylist to traverse elements
            
        Iterator itr=a1.iterator();
        while(itr.hasNext())
        {
            System.out.print(itr.next() + " ");
        }
        System.out.println();
        //Using Enhance for-loop
        
        for(String string : a1)
        {
            System.out.print(string +" ");
        }
    }
    
}
