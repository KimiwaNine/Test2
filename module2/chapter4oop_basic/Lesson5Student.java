package module2.chapter4oop_basic;

public class Lesson5Student {
    int id;
    String name;
    int age ;
    static String schoolName = "CodeWall";
    public static void main(String[] args) {
        Lesson5Student student1 = new Lesson5Student();
        student1.id=1;
        student1.name= "Mika";
        student1.age = 20;

        Lesson5Student student2 = new Lesson5Student();
        student2.id=2;
        student2.name= "Nine";
        student2.age=18;

        System.out.print(student1.id+" ");
        System.out.print(student1.name+" ");
        System.out.print(student1.age+"\n");
        System.out.println(schoolName);
        System.out.println();

        System.out.println(student2.id);
        System.out.println(student2.name);
        System.out.println(student2.age);
    }
}
