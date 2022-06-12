package Java_Demo.Account;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int id;
        double balance;
        double annualInterestRate;
        char choice;

        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your Id: ");
        id = input.nextInt();
        System.out.print("Please enter your Balance: ");
        balance = input.nextDouble();
        System.out.print("Please enter your annualInterestRate: ");
        annualInterestRate = input.nextDouble();

        System.out.println("Please wait a moment: ");
        Account bank = new Account(id,balance,annualInterestRate);

        System.out.print("Would you like to withdraw (W) or Deposit (D): ");
        choice = Character.toLowerCase(input.next().charAt(0));

        if (choice == 'w') {
            System.out.printf("Current Balance: $%.2f", bank.getBalance());
            System.out.println();
            System.out.print("Enter amount to withdraw: ");
            bank.withdraw(input.nextDouble());
            System.out.printf("New Balance: $%.2f", bank.getBalance());

        }
        else {
            System.out.printf("Current Balance: $%.2f", bank.getBalance());
            System.out.println();
            System.out.print("Enter amount to deposit: ");
            bank.deposit(input.nextDouble());
            System.out.printf("New Balance: $%.2f", bank.getBalance());

        }
    }
}
