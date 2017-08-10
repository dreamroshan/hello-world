/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adam.number;

/**
 *
 * @author Roshan
 */
import java.util.*;
import java.io.*;
public class AdamNumber {
    int CountNumberOfDigits(int n)
    {
        int numdigits = 0;
        do
        {
            n = n / 10;
            numdigits++;
        }
        while(n > 0);
        return numdigits;
    }
    int ReverseNumber(int n)
    {
        int i = 0,result = 0;
        int numdigits = CountNumberOfDigits(n);
        for(i = 0;i < numdigits;i++)
        {
            result *= 10;
            result += n % 10;
            n = n / 10;
        }
        return result;
    }
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) throws Exception {
        // TODO code application logic here
      BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
      
      System.out.print("\nEnter the minimum number of range: ");
      int min = Integer.parseInt(br.readLine());
      
      System.out.print("\nEnter the maximum number of range: ");
      int max = Integer.parseInt(br.readLine());
      
      AdamNumber an = new AdamNumber();
      
      System.out.println("\nAdam Numbers :");
      for (int i = min; i < max; i++)
      {
          int n = i;
          int rn = an.ReverseNumber(i);
          if (n == rn)
          {
              continue;
          }
          
          int sqrn = n * n;
          int sqrm = rn * rn;
          int revsqrm = an.ReverseNumber(sqrm);
          if(revsqrm == sqrn)
          {
              System.out.print(n + "\n");
          }
      }
      System.out.println();
    }
    
}
