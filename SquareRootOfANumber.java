/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package squareroot.of.a.number;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class SquareRootOfANumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Number");
        n = sc.nextInt();
        System.out.println(Math.sqrt(n));
    }
    
}
