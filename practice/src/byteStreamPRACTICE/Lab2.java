package byteStreamPRACTICE;

import java.io.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Lab2 {
    public static void main(String[] args) {
        String s = "Hello World!";
        byte[] b = s.getBytes();
        try {
            FileOutputStream output = new FileOutputStream("data.dat");
            output.write(b);
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        try {
            FileInputStream input = new FileInputStream("data.dat");
            int ch;
            while((ch = input.read()) != -1){
                System.out.print((char)ch);
            }
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Lab2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
