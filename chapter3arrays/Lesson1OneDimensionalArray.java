package chapter3arrays;


import java.util.Arrays;

public class Lesson1OneDimensionalArray {
    public static void main(String[] args) {
        //dataType variableName = value;
        String name = "Nine";

        String[] names = {"Nine","Ohkar","Ace","Tech"};
        int[] numbers ={11,22,33,44,55,66,77,88,99,100};

        System.out.println(name);
        System.out.println(names);
        System.out.println(Arrays.toString(names));

        System.out.println(names[1]);

        System.out.println(names.length);
        System.out.println(numbers.length);

        System.out.println(numbers[numbers.length -1]);

        name = "Mika";
        names[0] = "H3r";
        System.out.println(Arrays.toString(names));

        int numbers2[] = new int[7];
        System.out.println(Arrays.toString(numbers2));
        numbers2[0]=12;
        System.out.println(Arrays.toString(numbers2));

        String names2[] = new String[8];
        System.out.println(Arrays.toString(names2));

        System.out.println(names2[4]);
    }
}
