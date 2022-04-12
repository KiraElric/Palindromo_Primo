package model;

public class Palindrome extends Number{
    @Override
    public Boolean isPalindrome(int number){
        if (number / 10 >= 1){
            int reverseNumber = 0, remainder;
            int originalNumber = number;

            while (number !=0 ){
                remainder = number % 10;
                reverseNumber = (reverseNumber * 10) + remainder;
                number /= 10;
            }

            return (originalNumber == reverseNumber);
        }
        else {
            return false;
        }
    }

    public Boolean isPrime(int number){
        return null;
    };
    public Boolean isFibbonacci(int number){
        return null;
    };
}
