package inheritance;

public class Cars extends Vehicle {
    
    public Cars(String brand, String color) {
        super(brand, color);
    }
    
    public void brand(){
        System.out.println("The brand is " + getBrand());
    }
}
