package characterStreamPRACTICE;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab2 {

    public static void main(String[] args) {
        try {
            FileWriter file = new FileWriter("lab2.txt");
            BufferedWriter output = new BufferedWriter(file);
            output.write("Hello World!\n");
            output.write("Welcome To Java");
            output.close();
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader file = new FileReader("lab2.txt");
            BufferedReader input = new BufferedReader(file);
            String s;
            while((s = input.readLine()) != null){
                System.out.println(s);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
