package chapter3arrays;

import java.util.Scanner;

public class Lesson6UserInput {
    public static void main(String[] args) {
        System.out.print("Enter your age: ");

        Scanner scanner = new Scanner(System.in);
        int ageInput = scanner.nextInt();
        System.out.println("Your age is"+" "+ageInput);

        System.out.print("Enter your name: ");

        Scanner scanner1 = new Scanner(System.in);
        String name = scanner1.nextLine();
        System.out.println("God"+name);



    }
}
