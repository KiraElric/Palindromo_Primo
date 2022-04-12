package model;

public class Fibbonacci extends Numero {
    @Override
    public Boolean validate(int number){
        return isFibbonacci(number);
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
