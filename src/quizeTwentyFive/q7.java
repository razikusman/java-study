package quizeTwentyFive;

import java.util.Arrays;

public class q7 {
    public static void main(String[] args) {        
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function(items);
        System.out.println(items[0]); //output=>clock
 
    }
 
    public static void function(String[] items) {
        String[] moreItems = Arrays.copyOf(items, items.length);
        moreItems[0] = "bed";
    }
    
}
