/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package twin.primes;

/**
 *
 * @author Roshan
 */
public class TwinPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String primeNo = " ";
        int j = 0;
        int LastPrime = 1;
        
        System.out.println("Twin Primes are:");
        
        for(int i = 1; i < 100; i++)
        {
            for(j = 2; j < i;j++)
            {
                if(i % j == 0)
                {
                    break;
                }
            }
            if(i == j)
            {
                primeNo += i + " ";
                
                if((i - LastPrime) == 2)
                {
                    System.out.println("(" +(i - 2) + " , " + i + ")");
                }
                LastPrime = i;
            }
        }
        System.out.println("Prime Numbers are:" + primeNo);
    }
    
}
