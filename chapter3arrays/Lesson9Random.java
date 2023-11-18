package chapter3arrays;

import java.util.Random;

public class Lesson9Random {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt(1000,10000);
        System.out.println(randomNumber);
    }
}
