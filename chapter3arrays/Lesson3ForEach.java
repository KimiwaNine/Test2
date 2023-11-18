package chapter3arrays;

public class Lesson3ForEach {
    public static void main(String[] args) {
        int[] numbers ={1,3,5,7,9,11,13,33,55};

        for(int i =0;i< numbers.length; i++){
            System.out.print(numbers[i]+"\t");
        }
        System.out.println();
        for(int j=numbers.length-1; j>= 0; j--){
            System.out.print(numbers[j]+"\t");
        }
        /*
        foreach syntax : for (varDeclaration : arrayName)
                        {impl}
        */
        System.out.println();
        for(int number : numbers){
            System.out.print(number +"\t");
        }


    }
}
