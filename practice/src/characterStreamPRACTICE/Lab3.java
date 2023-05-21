package characterStreamPRACTICE;

import java.io.*;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab3 {

    public static void main(String[] args) {
        try {
            PrintWriter output = new PrintWriter("lab3.txt");
            output.println("Hello World!");
            output.println("Welcome to Java");
            output.println("Harry Potter");
            output.println(19);
            output.println(60.5);
            output.println(175.0);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("lab3.txt");
            Scanner input = new Scanner(file);
            while(input.hasNext()){
                String hello = input.nextLine();
                String welcome = input.nextLine();
                String harry = input.nextLine();
                int age = input.nextInt();
                double weight = input.nextDouble();
                double height = input.nextDouble();
                System.out.println(hello);
                System.out.println(welcome);
                System.out.println(harry);
                System.out.println(age);
                System.out.println(weight);
                System.out.println(height);
            }
            input.close();

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab3.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
