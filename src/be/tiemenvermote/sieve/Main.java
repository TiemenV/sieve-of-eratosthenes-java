/*
This program attempts to find new primes by using the mathematical Sieve of Eratosthenes method,
it prompts the user for a limit integer where it will stop searching, after it searched it outputs
the primes to the console.
*/
package be.tiemenvermote.sieve;

import java.util.List;

public class Main {
    public static void main(String[] args) {

        new Main().run();
    }

        private void run() {


            long startTime = System.currentTimeMillis();
            Sieve s = new Sieve(2000000);
        List<Integer> primes = s.getPrimes();
        long sum = 0;
        for(int p : primes) sum += p;
        int count = primes.size();


            System.out.printf("sum=%d, count=%d",sum,count);
            long endTime = System.currentTimeMillis()-startTime;

            System.out.printf("time=%d",endTime);





    }
}
