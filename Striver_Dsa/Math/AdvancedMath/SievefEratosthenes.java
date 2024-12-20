package Math.AdvancedMath;

import java.util.ArrayList;
import java.util.List;

public class SievefEratosthenes {

    public static List<Integer> sieveOfEratosthenes(int n)
     {
        boolean[] isPrime = new boolean[n + 1];
        List<Integer> primeNumbers = new ArrayList<>();

        // Initialize all elements as prime
        for (int i = 2; i <= n; i++)
        {
            isPrime[i] = true;
        }

        // Mark multiples of prime numbers as non-prime
        for (int p = 2; p * p <= n; p++) 
        {
            if (isPrime[p]) 
            {
                for (int i = p * p; i <= n; i += p) 
                {
                    isPrime[i] = false;
                }
            }
        }

        // Collect prime numbers
        for (int i = 2; i <= n; i++) 
        {
            if (isPrime[i]) 
            {
                primeNumbers.add(i);
            }
        }

        return primeNumbers;
    }

    public static void main(String[] args) {
        int n = 100;
        List<Integer> primeNumbers = sieveOfEratosthenes(n);

        System.out.println("Prime numbers up to " + n + ": " + primeNumbers);
    }
}

