package com.nisum.java.model;

public class Fibonacci extends Number {
    @Override
    public String validate(int number){
        return isFibbonacci(number)? "belongs to the fibonacci series" : "does not belong to the fibonacci series";
    }

    private Boolean isFibbonacci(int number) {
        int first = 0, second = 1, third = 0;

        while (third <= number){
            third = second + first;
            first = second;
            second = third;

            if (number == third){
                return true;
            }
        }
        return false;
    }
}
