package BankAccount;

import java.util.Scanner;
class Bank {
    private double balance;

    Bank (double balance) {
        this.balance = balance;
    }
    Scanner scanner = new Scanner(System.in);

    public void deposit() {
        System.out.print("Enter the amount do you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0) {
            System.out.println("Amount must be atleast 1 and above");
        } else {
            balance += amount;
        }
    }

    public void withdraw() {
        System.out.print("Enter the amount do you want to deposit: ");
        double amount = scanner.nextDouble();
        if (amount <= 0 || amount > balance) {
            System.out.println("Amount cannot be negative or greater in balance.");
        } else {
            balance -= amount;
        }
    }
    public void displayBalance() {
        System.out.printf("Balance: $%.2f\n", balance);
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank(20000);
        int choose = 0;
        do {
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.print("Choose an option (1-3): ");
            choose = scanner.nextInt();

            System.out.println();
            System.out.println("-------------------------------");
            switch (choose) {
                case 1:
                    bank.displayBalance();
                    break;
                case 2:
                    bank.deposit();
                    break;
                case 3:
                    bank.withdraw();
                    break;
                default:
                    System.out.println("\t\tExit");
            }
            System.out.println("-------------------------------");
        } while (choose >= 1 && choose <= 3);
        
    }
}