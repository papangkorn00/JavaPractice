package bankingApplication1;

import java.util.Random;
import java.util.Scanner;

public class MainBank {

    public static void main(String[] args) {
        int option = 0, number;
        String name;
        double balance;
        Bank bank = new Bank();
        Account account;
        Scanner scan = new Scanner(System.in);
        while (option != 6) {
            System.out.println("Main menu");
            System.out.println("1.Display All Accounts");
            System.out.println("2.Open New Account");
            System.out.println("3.Close Existing Account");
            System.out.println("4.Deposit");
            System.out.println("5.Withdraw");
            System.out.println("6.Exit");
            System.out.println();

            System.out.print("Enter your choice: ");
            option = scan.nextInt();
            scan.nextLine();

            switch (option) {
                case 1:
                    System.out.println("Hello");
                    break;
                case 2:
                    System.out.print("Enter Account Name: ");
                    name = scan.nextLine();
                    System.out.print("Enter Initial Balance: ");
                    balance = scan.nextDouble();
                    number = generateAccountNumber();
                    account = new Account(number, name, balance);
                    bank.openAccount(account);
                    break;
            }
            System.out.println();
        }

    }
    
    public static int generateAccountNumber(){
        Random rand = new Random();
        int number = 100000 + rand.nextInt(900000);
        return number;
    }
}
