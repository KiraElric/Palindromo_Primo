package model;

public class Prime extends Number{
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
}
