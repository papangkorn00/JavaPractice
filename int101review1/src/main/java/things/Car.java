
package things;

public class Car {
    private String brand;
    private String city;
    private String license_number;
    private double price;

    public Car(String brand, String city, String license_number, double price) {
        this.brand = brand;
        this.city = city;
        this.license_number = license_number;
        this.price = price;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getLicense_number() {
        return license_number;
    }

    public void setLicense_number(String license_number) {
        this.license_number = license_number;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public double cost(double cost){
          price += cost;
          return price;
    }
    
    public double discount(double discount){
        price -= discount;
        return price;
    }
    
    
    
}
