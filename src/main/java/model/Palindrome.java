package model;

public class Palindrome extends Number{
    public Boolean isPalindrome(int number){
        int reverseNumber = 0, remainder;
        int originalNumber = number;

        while (number !=0 ){
            remainder = number % 10;
            reverseNumber = (reverseNumber * 10) + remainder;
            number /= 10;
        }

        return (originalNumber == reverseNumber);
    }
}
