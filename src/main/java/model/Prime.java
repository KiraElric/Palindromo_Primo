package model;

public class Prime extends Numero {
    @Override
    public Boolean validate(int number){
        return isPrime(number);
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
