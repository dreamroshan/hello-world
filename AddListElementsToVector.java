/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package add.list.elements.to.vector;

/**
 *
 * @author Roshan
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
public class AddListElementsToVector {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Vector<String> vct = new Vector<String>();
        //adding elements to the end
        vct.add("First");
        vct.add("Second");
        vct.add("Third");
        vct.add("Random");
        System.out.println("Actual vector:"+vct);
        List<String> list = new ArrayList<String>();
        list.add("one");
        list.add("two");
        vct.addAll(list);
        System.out.println("After Copy: "+vct);
    }
    
}
