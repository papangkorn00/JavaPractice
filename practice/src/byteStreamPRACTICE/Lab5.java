package byteStreamPRACTICE;

import java.io.*;
import java.util.Date;

public class Lab5 {
    public static void main(String[] args) {
        try {
            ObjectOutputStream output = new ObjectOutputStream(new FileOutputStream("Lab5.dat"));
            output.writeUTF("Poom");
            output.writeDouble(77.8);
            output.writeDouble(175.0);
            output.writeObject(new Date());
            output.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        }

        try {
            ObjectInputStream input = new ObjectInputStream(new FileInputStream("Lab5.dat"));
            String name = input.readUTF();
            Double height = input.readDouble();
            Object date = (Date) (input.readObject());
            System.out.println(name + " " + height + " " + date);
            input.close();
        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException | ClassNotFoundException ex) {
            ex.printStackTrace();
        }
    }
}

