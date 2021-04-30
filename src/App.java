import java.util.Arrays;

public class App {
    public static void main(String[] args) throws Exception {
        
        //1
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        System.out.println(Arrays.toString(items)); 
        //output => [clock, table, ladder, chair, oven, phone]

        //2
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        items[1] = "cup";
        System.out.println(Arrays.toString(items));
        
        //output =>[clock, cup, ladder, chair, oven, phone]

        //3
        String[] items = new String[5];
        items[10%2] = "cup";
        int[] numbers = new int[3];
        numbers[5%1] = 3;
        
        System.out.println(items[0]);
        System.out.println(items[1]);
        System.out.println(numbers[0]);
        System.out.println(numbers[1]);
        //output=>  // cup
                    // null
                    // 3
                    // 0

        //q9
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];
 
        for (int i = 0; i < 3; i++) {
            moreItems[i] = items[i];
        }

        System.out.println(Arrays.toString(items));
        System.out.println(Arrays.toString(moreItems));

        // output
        // [clock, table, ladder, chair, oven, phone]
        // [clock, table, ladder, null, null, null]

        // q11
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];
 
        for (int i = (moreItems.length - 1); i >= 1; i--) {
            if (i % 2 == 0) {
                moreItems[i] = items[i];
            } 
        }
        
        System.out.println(Arrays.toString(moreItems));
        // [null, null, ladder, null, oven, null]

        // q12
        String[] items = {"clock", "table", "ladder", "chair", "oven", "phone"};
        String[] moreItems = new String[6];
 
        for (int i = (moreItems.length - 1); i >= 1; i--) {
            if (i % 2 != 0) {
                continue;
            } 
            moreItems[i] = items[i];
        }
        System.out.println(Arrays.toString(moreItems));
        // [null, null, ladder, null, oven, null]
    }
}
