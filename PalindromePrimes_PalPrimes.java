/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package palindrome.primes_palprimes;

/**
 *
 * @author Roshan
 */
public class PalindromePrimes_PalPrimes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int count = 1;
        System.out.println("Palindrome Primes are:\n");
        
        for(int i = 2; ; i++)
        {
            if((isPrime(i)) && (isPalindrome(i)))
            {
                System.out.print(i + " ");
                
                if(count % 10 == 0)
                {
                    System.out.println();
                }
                if(count == 20)
                {
                    break;
                }
                count++;
            }
        }
        
    }
    public static boolean isPrime(int num)
    {
        if((num == 1) || (num == 2))
        {
            return true;
        }
        for(int i = 2; i<= num / 2 ; i++)
        {
            if(num % i == 0)
            {
                return false;
            }
        }
        return true;
    }
    static int reversal(int num)
    {
        int result = 0;
        
        while(num != 0)
        {
            int lastDigit = num %10;
            result = result * 10 + lastDigit;
            num /= 10;
        }
        return result;
    }
    static boolean isPalindrome(int num)
    {
        return num == reversal(num);
    }
    
}
