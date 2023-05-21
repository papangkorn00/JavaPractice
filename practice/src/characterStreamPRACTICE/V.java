package characterStreamPRACTICE;

import java.io.*;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class V {

    public static void main(String[] args) {

        try {
            FileWriter output = new FileWriter("V.txt");
            output.write("500");
            output.write("5");
            output.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(V.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(V.class.getName()).log(Level.SEVERE, null, ex);
        }

        try {
            FileReader input = new FileReader("V.txt");
            int ch;
            ArrayList<Character> al = new ArrayList<>();

            while ((ch = input.read()) != -1) {

                al.add((char) ch);
            }
            String getString = "";
            for (Character s : al) {
                getString += String.valueOf(s);
            }

            String[] stringSplit = getString.split("");

            String s1 = "";
            String s2 = "";

            for (int i = 0; i < al.size(); i++) {
                if (i == al.size() -1) {
                    s2 += stringSplit[i];
                    break;
                }
                s1 += stringSplit[i];
            }

            int num1 = Integer.parseInt(s1);
            int num2 = Integer.parseInt(s2);
            System.out.println(num1 / num2);
            input.close();
        } catch (FileNotFoundException ex) {
            Logger.getLogger(V.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(V.class.getName()).log(Level.SEVERE, null, ex);
        }

    }
}
