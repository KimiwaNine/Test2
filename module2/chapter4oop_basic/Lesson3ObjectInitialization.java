package module2.chapter4oop_basic;

public class Lesson3ObjectInitialization {
    int number1;
    String someText;

    public static void main(String[] args) {
        int a = 9; //variable initialization

        // Object Create

        //object
        //instance
        //reference

        Lesson3ObjectInitialization obj1 = new Lesson3ObjectInitialization();
        obj1.number1 = 9;
        obj1.someText ="Hello,I am Nine";

        Lesson3ObjectInitialization obj2 = new Lesson3ObjectInitialization();
        obj2.number1= 20;
        obj2.someText ="I am 20";

        System.out.println(obj2.someText);
    }
    class Alian{
        int id;
        String name;

        public static void main(String[] args) {
            int Mid = 007;
            Lesson3ObjectInitialization id = new Lesson3ObjectInitialization();

        }
    }
}
