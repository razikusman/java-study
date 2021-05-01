package quizeThirtOne.q5;

public class q1 {
        public static void main(String[] args) {
            
            Shirt nike = new Shirt("Nike", 20.99, "Small");
        
            Shirt nike2 = new Shirt(nike);
            nike2.setSize("Large");
    
            System.out.println("Brand: " + nike.getBrand());
            System.out.println("Price: " + nike.getPrice());
            System.out.println("Size: " + nike.getSize());

            /*
            nike =>
            ---------
            Brand: Nike
            Price: 20.99
            Size: Small
            */

            System.out.println("Brand: " + nike2.getBrand());
            System.out.println("Price: " + nike2.getPrice());
            System.out.println("Size: " + nike2.getSize());
            /*
            nike2 =>
            ---------
            Brand: Nike
            Price: 20.99
            Size: Large
            */
     
        }
    
}

