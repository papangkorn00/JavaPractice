package Grade;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner inputG = new Scanner(System.in);

        int x = inputG.nextInt();

        if (x >= 80){
            System.out.println("A");
        }
        else if (x >= 70 ){
            System.out.println("B");
        }
        else if (x >= 60){
            System.out.println("C");
        }
        else if (x >= 50) {
            System.out.println("D");
        }
        else {
            System.out.println("F");
        }
    }
}
