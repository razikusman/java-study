package quizeTwentyFive;

public class q6 {
    public static void main(String[] args) {        
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function(items);
        System.out.println(items[0]); //output=>bed
 
    }
 
    public static void function(String[] items) {
        String[] moreItems = items;
        moreItems[0] = "bed";
    }

}
