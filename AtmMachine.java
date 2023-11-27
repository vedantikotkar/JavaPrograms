
import java.util.Scanner;

public class AtmMachine {
    public static UsersBankAccount userAccount;

    public static void main(String[] args) {
        double withdraw, deposit;
        try (Scanner sc = new Scanner(System.in)) {
            userAccount = new UsersBankAccount();

            while (true) {
                System.out.println("ATM Machine");
                System.out.println("1. Withdraw");
                System.out.println("2. Deposit");
                System.out.println("3. Check Balance");
                System.out.println("4. Exit");
                System.out.println("Choose the operation you want to perform: ");
                int choice = sc.nextInt();

                switch (choice) {
                    case 1:
                        System.out.println("Enter amount to withdraw: ");
                        withdraw = sc.nextDouble();
                        if (withdraw > 0 && userAccount.getBalance() >= withdraw) {
                            userAccount.withdraw(withdraw);
                            System.out.println("Please collect your money...!");
                        } else {
                            System.out.println("Invalid or insufficient balance...!");
                        }
                        System.out.println("");
                        break;

                    case 2:
                        System.out.println("Enter amount to be deposited: ");
                        deposit = sc.nextDouble();
                        if (deposit > 0) {
                            userAccount.deposit(deposit);
                            System.out.println("Your money has been successfully deposited...!");
                        } else {
                            System.out.println("Invalid deposit amount...!");
                        }
                        System.out.println("");
                        break;

                    case 3:
                        System.out.println("Total Balance is: " + userAccount.getBalance());
                        System.out.println("");
                        break;

                    case 4:
                        System.exit(0);


                        
                }
            }
        }
    }
}

class UsersBankAccount {
    private double balance;

    public UsersBankAccount() {
        balance = 0.0;
    }

    public double getBalance() {
        return balance;
    }

    public void withdraw(double amount) {
        if (amount > 0 && balance >= amount) {
            balance -= amount;
        }
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
    }
}
