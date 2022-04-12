package model;

public class Prime extends Number{
    @Override
    public Boolean isPrime(int number){
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

    public Boolean isFibbonacci(int number){
        return null;
    };
    public Boolean isPalindrome(int number){
        return null;
    };
}
