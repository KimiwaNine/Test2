package chapter3arrays;

public class NestedForLoop {
    public static void main(String[] args) {
        for(int i=0; i<5; i++){  //row
            for(int j=0; j<5; j++){ //col
                System.out.print("*");
            }
            System.out.println();
        }
        System.out.println();
        for(int i=0; i<5; i++){
            for (int j=0; j<=i; j++){
                System.out.print("*"+"\t");
            }
            System.out.println();
        }
        System.out.println();

        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j < i; j++) {
                System.out.print("  ");
            }
            for (int n = i; n <= 5; n++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        System.out.println();
        for (int i = 1; i <= 5; i++) {

            for (int j = 1; j <= 5 - i; j++) {
                System.out.print(" ");
            }

            for (int n = 1; n <= i; n++) {
                System.out.print("*");
            }

            System.out.println();
        }

    }
}
