package quizeTwentysix;

import java.util.Arrays;

public class q3_4 {
    public static void main(String[] args) {
        
        //2D array with rows 3 coloumns 3
        String[][] table = new String[3][3]; 
        System.out.println((table[0]));//reference
        

        System.out.println((Arrays.toString(table[0])));//[null, null, null]
        

        System.out.println(table.length); //3
        System.out.println(table[0].length);//3
        System.out.println(table[1].length);//3







        //2D array with rows 3 coloumns 2
        String[][] table1 = new String[3][2]; 

        System.out.println(table1.length); //3
        System.out.println(table1[0].length);//2
        System.out.println(table1[1].length);//2

        

        // System.out.println(Arrays.toString(table[3]));//outof bound
        




        
        //2D array with rows 2 coloumns 3
        String[][] table2 = new String[2][3]; 

        System.out.println(table2.length); //2
        System.out.println(table2[0].length);//3
        System.out.println(table2[1].length);//3


        System.out.println((Arrays.toString(table[0]))); //[null,null,null]
        System.out.println((Arrays.toString(table1[0]))); //[null,null]
        System.out.println((Arrays.toString(table2[0]))); //[null,null,null]
    }
    
}
