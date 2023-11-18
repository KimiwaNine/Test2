package chapter3arrays;

import java.util.Arrays;

public class Lesson2TwoDimensionalArray {
    public static void main(String[] args) {
        int[] myArray={};

        int[][] myTwoDArray ={
                {1,2,3},{4,5,6},{7,8,9}
        };

        String [][] rooms = new String[3][4];
        rooms[0][0] ="SeaView";
        rooms[0][1] ="SeaView1";
        rooms[0][2] ="SeaView2";
        rooms[0][3] ="SeaView3";

        rooms[1][0] ="DD";
        rooms[1][1] ="DD1";
        rooms[1][2] ="DD2";
        rooms[1][3] ="DD3";

        rooms[2][0] ="Ac";
        rooms[2][1] ="Ac1";
        rooms[2][2] ="Ac2";
        rooms[2][3] ="Ac3";

//        System.out.println(rooms);
//        System.out.println(rooms[2][3]);
//        System.out.println(Arrays.toString(rooms));
//        System.out.println(Arrays.toString(rooms[0]));

        System.out.println(rooms.length);   //row
        System.out.println(rooms[0].length);//col

        for(int i=0; i< rooms.length;i++){
            for (int j=0 ; j< rooms[i].length; j++){
                System.out.print(rooms[i][j] .toUpperCase()+"\t");
            }
            System.out.println();
        }

    }
}
