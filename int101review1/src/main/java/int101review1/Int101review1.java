package int101review1;

import things.Car;
import world.Company;
import human.Person;

public class Int101review1 {

    public static void main(String[] args) {
        testCar();
        testDivident();
    }

    public static void testCar() {

        Car c1 = new Car("BMW", "Bangkok", "1234E5", 3_500_000.00);

        System.out.println("Brand: " + c1.getBrand());
        System.out.println("City: " + c1.getCity());
        System.out.println("License_number: " + c1.getLicense_number());
        System.out.println("Price: " + c1.getPrice());

        c1.setBrand("Honda");
        c1.setCity("Tokyo");
        c1.setLicense_number("4321A5");
        c1.setPrice(1_000_000.00);

        System.out.println("=============================");

        System.out.println("Set Brand: " + c1.getBrand());
        System.out.println("Set City: " + c1.getCity());
        System.out.println("Set License_number: " + c1.getLicense_number());
        System.out.println("Set Price: " + c1.getPrice());

        c1.cost(5000.00);
        System.out.println(c1.cost(0));
        c1.discount(5000.00);
        System.out.println(c1.discount(0));

    }

    public static void testDivident() {
        Person person = new Person("Poom");
        Company c = new Company("Coke", "BKK", 300_000_000.00, person);

        System.out.println("=============================");

        System.out.println("TestCompanyAndPerson");
        System.out.println( c);
        System.out.println("Dividend = " + c.dividend(1));

    }

}
