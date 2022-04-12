package model;

public class Fibbonacci extends Number{
    @Override
    public Boolean isFibbonacci(int number) {
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

    public Boolean isPrime(int number){
        return null;
    };
    public Boolean isPalindrome(int number){
        return null;
    };
}
