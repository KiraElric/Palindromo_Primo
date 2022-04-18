package com.nisum.java.model;

public class Prime extends Number {
    @Override
    public String validate(int number){
        return isPrime(number)? "is a Prime number" : "does not belong to the set of primes numbers";
    }

    private Boolean isPrime(int number){
        if (number == 1 || number == 0){
            return false;
        }
        else {
            for (int i=2; i< number; i++){
                if (number%i == 0){
                    return false;
                }
            }
        }

        return true;
    }
}
