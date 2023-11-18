package chapter3arrays;

import java.util.Scanner;

public class Lesson7RepeatInput {
    public static void main(String[] args) {
        System.out.print("Enter a number: ");

        Scanner scanner = new Scanner(System.in);

        while (true){
            int number = scanner.nextInt();
            if(number%2==0){
                System.out.println("This is Even");
                break;
            }else {
                System.out.println("This is Odd");
                System.out.print("Enter an Even number again: ");
            }
        }
    }
}
