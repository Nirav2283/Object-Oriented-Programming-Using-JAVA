// 4. Create a class named Bank_Account with data memebers accountNo, userName, email, accountType and accountBalance,Also create methods getAccountDetails() and displayAccountDetails()

import java.util.Scanner;

public class Lab_5_4 {
    public static class Bank_Account {
        int accountNo;
        String userName;
        String email;
        String accountType;
        double accountBalance;
        Scanner sc = new Scanner(System.in);

        void getAccountDetails(int accountNo , String userName , String accountType ,  String email ,  double accountBalance ) {
            this.accountNo = accountNo;
            this.userName = userName;
            this.email = email;
            this.accountBalance = accountBalance;
            this.accountType = accountType;
           
        }

        void displayAccountDetails() {
            System.out.println("Account Number: " + this.accountNo);
            System.out.println("User Name: " + this.userName);
            System.out.println("E-Mail: " + this.email);
            System.out.println("Account Type: " + this.accountType);
            System.out.println("Balance: " + this.accountBalance);
        }
    }

    public static void main(String[] args) {
        int accountNo;
        String userName;
        String email;
        String accountType;
        double accountBalance;
        Scanner sc = new Scanner(System.in);
        Bank_Account acc1 = new Bank_Account();
        System.out.print("Enter your Account Number: ");
        accountNo = sc.nextInt();
        System.out.print("Enter Your User Name: ");
        sc.nextLine();
        userName = sc.nextLine();
        System.out.print("Enter your E-Mail: ");
        email = sc.nextLine();
        System.out.print("Enter your Account Type: ");
        accountType = sc.nextLine();
        System.out.print("Enter your Balance: ");
        accountBalance = sc.nextDouble();
        acc1.getAccountDetails(accountNo , userName , email, accountType , accountBalance );
        System.out.println();
        acc1.displayAccountDetails();
    }
}