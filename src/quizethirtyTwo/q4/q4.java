package quizethirtyTwo.q4;

public class q4 {
    public static void main(String[] args) {
        
        Dessert cake = new Dessert(4.99);
        cake.setIngredients(new String[] {"Eggs", "Flower", "Baking Powder"});
 
        // String[] randomArray = cake.getIngredients();
        // randomArray[2] = "Filling";
 
 
        System.out.print(cake.getIngredients());
 
    }
}
