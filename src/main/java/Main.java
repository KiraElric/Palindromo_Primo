import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Prime prime = new Prime();
            Palindrome palindrome = new Palindrome();
            System.out.println("Ingrese un numero: ");
            int number = input.nextInt();

            if (prime.isPrime(number) && palindrome.isPalindrome(number)){
                System.out.println(number + " -> El numero es primo y palindromo");
            }
            else if (prime.isPrime(number)){
                System.out.println(number + " -> El numero es primo");
            }
            else if (palindrome.isPalindrome(number)){
                System.out.println(number + " -> El numero es palindromo");
            }
            else {
                System.out.println(number + " -> El numero no es primo ni palindromo");
            }
        } catch (Exception error){
            System.out.println("El valor ingresado no es un numero....");
        }





    }
}
