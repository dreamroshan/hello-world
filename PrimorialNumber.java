/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package primorial.number;

/**
 *
 * @author Roshan
 */
import java.util.Scanner;
public class PrimorialNumber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int num;
        System.out.print("Enter a number :");
        
        Scanner in = new Scanner(System.in);
        num = in.nextInt();
        
        int res = 2, flag = 0;
        String str = "2";
        for(int i = 3;i <= num ; i++)
        {
            flag = 0;
            for(int j = 2;j < i; j++)
            {
                if(i % j == 0)
                {
                    flag = 1;
                    break;
                }
            }
            if(flag != 1)
            {
                res *= i;
                str = str + "*" + i;
            }
        }
        System.out.println(num + " #= " + str + "=" + res);
    }
    
}
