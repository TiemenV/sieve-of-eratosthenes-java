package be.tiemenvermote.sieve;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Sieve {

    boolean[] array;

    public Sieve(int limit) {
        array = new boolean[limit+1];
        Arrays.fill(array, true); // todo check spec van java
        array[0] = false;
        array[1] = false;
        performSieve();
    }

    private void performSieve() {
        for(int i=2 ; i<array.length; i++) {
            if (isPrime(i)) {
                for(int n=2 ; n*i<array.length; n++){
                    array[n*i] = false;
                }
            }
        }
    }


    public List<Integer> getPrimes() {
        List<Integer> lst = new ArrayList<>();

        for(int i=0 ; i<array.length; i++) {
            if (isPrime(i)){
                lst.add(i);
            }
        }

        return lst;
    }

    public boolean isPrime(int i) {
        return array[i];
    }
}
