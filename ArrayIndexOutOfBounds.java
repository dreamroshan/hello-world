/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package array.index.out.of.bounds;

/**
 *
 * @author Roshan
 */
public class ArrayIndexOutOfBounds {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String languages[] = {"C","C++","Java","Perl","Python"};
        
        try {
            for(int c = 1; c<=5;c++){
                System.out.println(languages[c]);
            }
                    
        }catch (Exception e){
            System.out.println(e);
        }
    }
    
}
