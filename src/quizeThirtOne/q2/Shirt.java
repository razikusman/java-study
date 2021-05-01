package quizeThirtOne.q2;

public class Shirt {
 
    private String brand;
    private double price;
    private String size;
 
    public Shirt(String brand, double price, String size) {
        this.brand = brand;
        this.price = price;
        this.size = size;
    }
 
    public Shirt(double price, String size) {
        this.brand = "No name";
        this.price = price;
        this.size = size;
    }
    public Shirt(double price) {
        this.brand = "No name";
        this.price = price;
        this.size = "One size fits all";
    }
 
    public Shirt(Shirt source) {
        this.brand = source.brand;
        this.price = source.price;
        this.size = source.size;
    }

    
    public void setBrand(String brand) {
        this.brand = brand;
    }

    
    public void setPrice(double price) {
        this.price = price;
    }

     
    public void setSize(String size) {
        this.size = size;
    }

	public String getBrand() {
        return this.brand;
    }
    public double getPrice() {
        return this.price;
    }
    public String getSize() {
        return this.size;
    }

}