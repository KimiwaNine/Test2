package chapter1;

public class TernaryOpt {
    public static void main(String[] args) {
       int age = 20;

       String result = (age > 18)? "adult" : "not adult";
       System.out.println(result);


    }
}
/*
   ?;
   syntax;
   (condition)? doWhenTrue : doWhenFalse
 */
