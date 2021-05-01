package quizeTwentysix;

import java.util.Arrays;

public class q1 {
    public static void main(String[] args) {
        int[][] array = new int[3][3];
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                array[i][j] = 0;
            }
        }
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(array[i][j]);
            }
            System.out.println();
        }

        //000
        //000
        //000

        
        for(int i=0 ; i<3 ; i++){
            for(int j=0 ; j<3 ; j++){
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
        
        //0 0 0 
        //0 0 0 
        //0 0 0 
        
    }
}
