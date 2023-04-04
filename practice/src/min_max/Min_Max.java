package min_max;

import java.util.Scanner;

public class Min_Max {
    public static void main(String[] args) {
        Scanner value = new Scanner(System.in);
        int input1 = value.nextInt();
        int input2 = value.nextInt();

        if(input1 > input2){
            System.out.println("A");
        } else if (input1 < input2) {
            System.out.println("B");
        }else {
            System.out.println("AB");
        }
    }
}
