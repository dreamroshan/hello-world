/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics.of.treeset;

/**
 *
 * @author Roshan
 */
import java.util.TreeSet;
public class BasicsOfTreeSet {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeSet<Integer> ts = new TreeSet<Integer>();
            ts.add(12);
            ts.add(11);
            ts.add(14);
            ts.add(15);
            ts.add(10);
            ts.add(16);
            ts.add(17);
                
            System.out.println(ts);
            
            //getting the ceiling value for 13
            System.out.println("ceiling value : "+ts.ceiling(13));
            
            //getting the floor value for 13
            System.out.println("floor value : "+ ts.floor(13));
            
            //first element
            System.out.println("first element : "+ts.first());
            
            //last element
            System.out.println("last element : "+ts.last());
            
            System.out.println("poll first element :"+ts.pollFirst());
            System.out.println("poll last element :"+ts.pollLast());
            System.out.println("TreeSet after polling :" +ts);
            
            //the greatest element less than 12
            System.out.println("lower element of 12 :"+ts.lower(12));
            
            //the least element greater than 12
            System.out.println("higher element of 12 :" +ts.higher(12));
            
            System.out.println("Is 12 is present "+ts.contains(12));
            
            //TreeSet to Array
            Object[] a = ts.toArray();
            
            System.out.print("Array : ");
            for(Object object : a)
            {
                System.out.print(object+" ");
            }
            System.out.println();
            
            //descending Set
            System.out.print("descending Set"+ts.descendingSet());
            System.out.println();
            
            //remove from TreeSet
            ts.remove(11);
            
            //Size of TreeSet
            System.out.println("size of TreeSet after removal of 11 :"+ts.size());
            
            //clear whole TreeSet
            ts.clear();
            System.out.println(ts+" "+"Is TreeSet is empty :"+ts.isEmpty());
    }
    
}
