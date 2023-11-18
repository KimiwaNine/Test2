package chapter3arrays;

public class Lesson4JaggedArray {
    public static void main(String[] args) {
        int[][] myJagArray= {
                {1,2,3,4,5},
                {7,6},
                {5,6,8,9}
        };
//        int[][] myJaggedArray = new int[3][]; //foreach
//        myJaggedArray[0][0] = 3;

        for (int row =0; row < myJagArray.length; row++){
            for (int col =0; col< myJagArray[row].length; col++){
                System.out.print(myJagArray[row][col]);
            }
            System.out.println();
        }
        System.out.println();

        for (int[] myArray : myJagArray){
            for(int number : myArray){
                System.out.print(number+"\t");
            }
            System.out.println();
        }
    }
}
