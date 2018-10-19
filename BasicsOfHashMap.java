/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package basics.of.hashmap;

/**
 *
 * @author Roshan
 */
import java.util.HashMap;
public class BasicsOfHashMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HashMap<Integer,String> hm = new HashMap<Integer ,String>();
        
        hm.put(1,"android");
        hm.put(2,"java");
        hm.put(3,"php");
        hm.put(4,"c++");
        hm.put(5,"javascript");
        hm.put(6,"html");
            
            System.out.println(hm+" ");
            System.out.println();
       
        System.out.println("Value at 1 is android : "+hm.containsKey(1));
        System.out.println("Value at 1 : "+hm.get(1));
        System.out.println("java is present : "+hm.containsValue("java"));
        
        //remove
        hm.remove(2);
        hm.remove(6 , "html");
        System.out.println("Size after remove operation : "+hm.size());
        
        //replace
        hm.replace(5,"jquery");
        hm.replace(4, "c++", "scala");
        System.out.println("HashMap after replace "+hm);
        
        hm.clear();
        System.out.println(hm+"Is Map is empty "+hm.isEmpty());
    }
    
}
