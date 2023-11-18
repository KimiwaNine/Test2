package module2.chapter4oop_basic;

public class Lesson1Variables {
    //global variables //properties //attributes //state //field //data

    String test = "I am Nine"; // String

    int number1 = 9; //instance variable

    static int number2 = 19; //static variable

    public static void main(String[] args) {
        // dataType variableName = value;
        int a = 9;
        System.out.println(a);

        //Type objectName =  object(new Constructor);
        Lesson1Variables object = new Lesson1Variables();
        System.out.println(object.number1);

        System.out.println(number2);
        System.out.println(Lesson1Variables.number2);
    }
}
