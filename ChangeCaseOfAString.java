/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package change.pkgcase.of.a.string;

/**
 *
 * @author Roshan
 */
public class ChangeCaseOfAString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String str = "Java Programs With Output";
        
        //toUpperCase()method converts the complete String in upper case
        String strUpper = str.toUpperCase();
        
        //toLowerCase() method converts the complete string in lower case
        String strLower = str.toLowerCase();
        
        //printing changed case string
        System.out.println("Upper Case: " + strUpper);
        System.out.println("Lower Case: " + strLower);
    }
    
}
