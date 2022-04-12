import java.util.Scanner;
import model.*;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Prime prime = new Prime();
            Palindrome palindrome = new Palindrome();
            Fibbonacci fibbonacci = new Fibbonacci();
            System.out.println("Ingrese un numero: ");
            int number = input.nextInt();

            if (prime.isPrime(number) && palindrome.isPalindrome(number) && fibbonacci.isFibbonacci(number)){
                System.out.println(number + " -> El numero es primo, palindromo y pertenece a la serie de fibonnacci");
            }
            else if (prime.isPrime(number) && palindrome.isPalindrome(number)){
                System.out.println(number + " -> El numero es primo y palindromo");
            }
            else if (prime.isPrime(number) && fibbonacci.isFibbonacci(number)){
                System.out.println(number + " -> El numero es primo y pertenece a la serie de fibonnacci");
            }
            else if (palindrome.isPalindrome(number) && fibbonacci.isFibbonacci(number)){
                System.out.println(number + " -> El numero es palindromo y pertenece a la serie de fibonnacci");
            }
            else if (prime.isPrime(number)){
                System.out.println(number + " -> El numero es primo");
            }
            else if (palindrome.isPalindrome(number)){
                System.out.println(number + " -> El numero es palindromo");
            }
            else if (fibbonacci.isFibbonacci(number)){
                System.out.println(number + " -> El numero pertenece a la serie de fibbonacci");
            }
            else {
                System.out.println(number + " -> El numero no es primo ni palindromo ni pertenece a la serie");
            }
        } catch (Exception error){
            System.out.println("El valor ingresado no es un numero....");
        }





    }
}
