package Pattern;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {

        Scanner x = new Scanner(System.in);

        int input = x.nextInt();

        for(int i = 1; i<=input;i++){
            for(int j = 0; j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}


