package quizeTwentyFive;

public class q5 {
    public static void main(String[] args) {        
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        function(items);
        System.out.println(items[0]);//=>bed
 
    }
 
    public static void function(String[] items) {
        items[0] = "bed";
    }

}
