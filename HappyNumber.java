/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package happy.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class HappyNumber {

    /**
     * @param args the command line arguments
     */
    static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    int n;
    HappyNumber()
    {
        n = 0;
    }
    void getnum(int num)
    {
        n = num;
    }
    int sum_sq_digits(int x)
    {
        if(x == 0)
            return 0;
        else
        {
            int d = x % 10;
            return (d * d + sum_sq_digits(x / 10));
        }
    }
    void isHappyNumber()
    {
        int a = sum_sq_digits(n);
        while(a > 9)
        {
            a = sum_sq_digits(a);
        }
        if(a == 1)
            System.out.print(n + " is a Happy Number");
        else
            System.out.print(n + " is not a Happy Number");
    }
    public static void main(String args[]) throws IOException{
        // TODO code application logic here
        HappyNumber ob = new HappyNumber();
        System.out.print("Enter any number : ");
        int b = Integer.parseInt(br.readLine());
        ob.getnum(b);
        ob.isHappyNumber();
    }
    
}
