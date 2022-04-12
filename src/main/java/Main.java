import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Numero prime = new Prime();
            Numero palindrome = new Palindrome();
            Numero fibbonacci = new Fibbonacci();
            System.out.println("Ingrese un numero: ");
            int number = input.nextInt();

            if (prime.validate(number) && palindrome.validate(number) && fibbonacci.validate(number)){
                System.out.println(number + " -> El numero es primo, palindromo y pertenece a la serie de fibonnacci");
            } else if (prime.validate(number) && palindrome.validate(number)){
                System.out.println(number + " -> El numero es primo y palindromo");
            } else if (prime.validate(number) && fibbonacci.validate(number)){
                System.out.println(number + " -> El numero es primo y pertenece a la serie de fibonnacci");
            } else if (palindrome.validate(number) && fibbonacci.validate(number)){
                System.out.println(number + " -> El numero es palindromo y pertenece a la serie de fibonnacci");
            } else if (prime.validate(number)){
                System.out.println(number + " -> El numero es primo");
            } else if (palindrome.validate(number)){
                System.out.println(number + " -> El numero es palindromo");
            } else if (fibbonacci.validate(number)){
                System.out.println(number + " -> El numero pertenece a la serie de fibbonacci");
            } else {
                System.out.println(number + " -> El numero no es primo ni palindromo ni pertenece a la serie");
            }
        } catch (Exception error){
            System.out.println("El valor ingresado no es un numero....");
        }
    }
}
