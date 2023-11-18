package homework;

import java.util.Random;
import java.util.Scanner;

public class hw1 {
    public static void main(String[] args) {
        System.out.println("Welcome to 'Mind Game'");
        Random rnum = new Random();
        int randomNum = rnum.nextInt(0, 100);

        System.out.print("Enter a number : ");
        Scanner sc = new Scanner(System.in);
        int gcount = 0;

        while (true){
            int inputnum = sc.nextInt();
            gcount++;
            if (inputnum == randomNum ) {
                System.out.println("Congractulation!!! Your answer is correct !!!");
                System.out.println("Guess count : " + gcount);
                //Guess count condition
                if(gcount <=10){
                    System.out.println("You Are The Best");
                }
                else if(gcount>10 && gcount<30){
                    System.out.println("You are Good");
                }
                else if(gcount>30 && gcount<50){
                    System.out.println("Try harder");
                }
                else{
                    System.out.println("Stupic");
                }
                break;
            } else if (inputnum > randomNum) {
                System.out.println("Try again!!! Your input is greater than correct answer");
                System.out.print("\nEnter a number again : ");
            } else {
                System.out.println("Try again!!! Your answer is less than correct number");
                System.out.print("\nEnter a number again : ");
            }
        }

    }
}