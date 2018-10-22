/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package special.number;

/**
 *
 * @author Roshan
 */
import java.io.*;
public class SpecialNumber {

    /**
     * @param args the command line arguments
     */
   
        static BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        static int num;
        
        private void input() throws Exception
        {
            System.out.print("Enter the Number to check for Special Number :");
            num = Integer.parseInt(br.readLine());
        }
        public boolean isSpecial(int n)
        {
            int spec = 0, temp = n;
            while (temp % 10 != 0)
            {
                spec += factorial(temp % 10);
                temp /= 10;
            }
            if(spec == n)
                return true;
            else
                return false;
        }
        private int factorial (int n)
        {
            if((n == 1)|| (n == 0))
                return 1;
            else
                return(n * factorial(n - 1));
        }
         public static void main(String[] args) throws Exception {
        // TODO code application logic here
        SpecialNumber obj = new SpecialNumber();
        obj.input();
        if(obj.isSpecial(num))
            System.out.print(num + " is a Special Number");
        else
            System.out.print(num + " is not a Special Number");
    }
    
}
