/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package magic.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class MagicNumber {

    /**
     * @param args the command line arguments
     */
    private int input() throws Exception
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Enter any number : ");
        
        return Integer.parseInt(br.readLine());
    }
    public boolean isMagic(int n)
    {
        int sum = 0, flag , d = 0;
        do
        {
            flag = 0;
            while(n % 10 == 0)
            {
                n /= 10;
            }
            
            while(n % 10 != 0 || n > 0)
            {
                sum += (n % 10);
                n /= 10;
            }
            if(sum >= 10)
            {
                n = sum;
                sum = 0;
            }
            else
                flag = 1;
        }
        while(flag == 0);
        
        if(sum  == 1)
            return true;
        else
            return false;
    }
    public static void main(String[] args)throws Exception
    {
        // TODO code application logic here
        MagicNumber mn = new MagicNumber();
        int num = mn.input();
        
        if(mn.isMagic(num))
            System.out.println(num + " is a Magic Number ");
        else
            System.out.println(num + " is not a Magic Number");
    }
    
}
