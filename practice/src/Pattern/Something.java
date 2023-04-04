package Pattern;
import java.util.Scanner;

public class Something {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);
    String name =  input.nextLine();
    int age = input.nextInt();


        if(age <= 2003){
            System.out.println("Welcome" + " " + name + " " + "to"+ " " + "NongGipsy" + " " + "Pub");
        } else if(age > 2004) {
            System.out.println("You shall not pass!");
        }

    }
}