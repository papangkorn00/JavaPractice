package Circle1;

public class Test {
    public static void main(String[] args) {
        Circle c1 = new Circle();
       
        System.out.println("The circle has radius of " + c1.getRadius() + " and area of " + c1.getArea());
        
        Circle c2 = new Circle();
        System.out.println("The circle has radius of " + c2.getRadius() + " and area of " + c2.getArea());
        
        Circle c3 = new Circle();
        System.out.println(c3.getColor());
         
        Circle c4 = new Circle();
        c4.setRadius(5.0);
        System.out.println("The radius is " + c4.getRadius());
        
        c4.setColor("purple");
        System.out.println("The color is " + c4.getColor());
        
        Circle c5 = new Circle();
        System.out.println(c5);
    }
}
