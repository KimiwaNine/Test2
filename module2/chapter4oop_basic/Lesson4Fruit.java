package module2.chapter4oop_basic;

public class Lesson4Fruit {

    String name;
    String color;
    String size;


    public static void main(String[] args) {
        Lesson4Fruit fruit1 = new Lesson4Fruit();
        fruit1.name = "Apple";
        fruit1.color = "Red";
        fruit1.size = "Small";

        System.out.println(fruit1.name);


        Lesson4Fruit fruit2 = new Lesson4Fruit();
        fruit2.name = "Orange";
        fruit2.color = "orange";
        fruit2.size = "Small";

        System.out.println(fruit2);

        fruit1.name = "Grape";
        System.out.println(fruit2.name);


    }
}


//properties
//behavior