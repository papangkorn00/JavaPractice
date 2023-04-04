package enumTutorial;


public class Vehicle {
    private String color;
    private Cars brand;

    public Vehicle(String color, Cars brand) {
        this.color = color;
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public Cars getBrand() {
        return brand;
    }
}

class Test {
    public static void main(String[] args) {
        Vehicle v1 = new Vehicle("Blue",Cars.AUDI);
        Vehicle v2 = new Vehicle("Yellow",Cars.BMW);
        Vehicle v3 = new Vehicle("Red",Cars.FORD);
        
        System.out.println(v1.getBrand().equals(Cars.valueOf("AUDI")) ? v1.getColor() : "Not this color!!");
        System.out.println(v2.getBrand().equals(Cars.valueOf("FORD")) ? v2.getColor() : "Not this color!!");
        System.out.println(v3.getBrand().equals(Cars.valueOf("FORD")) ? v3.getColor() : "Not this color!!");

        
    }
}
