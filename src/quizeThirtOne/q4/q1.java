package quizeThirtOne.q4;

public class q1 {
        public static void main(String[] args) {
            
            Shirt nike = new Shirt("Nike", 20.99, "Small");
        
            Shirt nike2 = nike;
            nike2.setSize("Large");
    
            System.out.println("Brand: " + nike.getBrand());
            System.out.println("Price: " + nike.getPrice());
            System.out.println("Size: " + nike.getSize());
     
        }
    
}

