package Circle2;

public class TestMain {
    public static void main(String[] args) {
        CircleTwo c1 = new CircleTwo(1.1);
        System.out.println(c1);
        CircleTwo c2 = new CircleTwo();
        System.out.println(c2);
        
        c1.setRadius(2.2);
        System.out.println(c1);
        System.out.println("radius is: " + c1.getRadius());
         
        System.out.printf("area is: %.2f%n", c1.getArea());
        System.out.printf("circumference is: %.2f%n", c1.getCircumference());
    }
}
