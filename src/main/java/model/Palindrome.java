package model;

public class Palindrome extends Numero {
    @Override
    public Boolean validate(int number){
        return isPalindrome(number);
    }

    private Boolean isPalindrome(int number){
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
}
