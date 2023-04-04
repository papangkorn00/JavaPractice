package AplusB;

import java.util.Scanner;

public class AandB {
    public static void main(String[] args) {
        Scanner x = new Scanner(System.in);
        System.out.println("Enter Input A and B");
        int inputA = x.nextInt();
        int inputB = x.nextInt();

        System.out.println("Input A + Input B = " + (inputA+inputB));
    }
}
