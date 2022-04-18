import java.util.Scanner;

import com.nisum.java.model.Fibonacci;
import com.nisum.java.model.Palindrome;
import com.nisum.java.model.Prime;
import com.nisum.java.model.Number;

public class Main {
    public static void main(String[] args) {
        try {
            Scanner input = new Scanner(System.in);
            Number prime = new Prime();
            Number palindrome = new Palindrome();
            Number fibbonacci = new Fibonacci();
            System.out.println("Enter a number: ");
            int number = input.nextInt();

            System.out.println("The number " + prime.validate(number) + ", " + palindrome.validate(number) + ", " + fibbonacci.validate(number));
        } catch (Exception error){
            System.out.println("Ups!... The entered value is not a number");
        }
    }
}
