/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BankAccount;

import java.util.Scanner;

/**
 *
 * @author HP
 */

//Bank Account class to store balance
class BankAccount {
    private double balance;
    
    public BankAccount(double initialBalance){
        this.balance = initialBalance;
    }
    
    public void deposit(double amount){
        balance += amount;
        System.out.println("Deposited: $" + amount);
    }
    
    public void withdraw(double amount){
        if(amount <= balance){
            balance -= amount;
            System.out.println("Withdraw: $" + amount);
        }else{
            System.out.println("Insufficient balance.");
        }
    }
    
    public void checkBalance(){
        System.out.println("Current balance: $" + balance);
    }
}

    //ATM class to interfere with the user
    class ATM{
        private final BankAccount account;
        
        public ATM(BankAccount account){
            this.account = account;
        }
        
        public void start(){
            Scanner scanner = new Scanner(System.in);
            while(true){
                System.out.println("\n 1:Deposit \n 2:Withdraw \n 3.Check Balance \n 4:Exit");
                switch(scanner.nextInt()){
                    case 1:{
                        System.out.println("Enter amount to deposit:");
                        account.deposit(scanner.nextDouble());
                    }
                    case 2:{
                        System.out.println("Enter amount to withdraw:");
                        account.withdraw(scanner.nextDouble());
                    }
                    case 3: account.checkBalance();
                    
                    case 4:{
                        System.out.println("Goodbye!");
                        return;
                    }
                    default: System.out.println("Invalid option.");
                }
            }
        }
    }
        
    //Main class to run the program
    public class bankAccount{
        public static void main(String[] args){ 
        // TODO code application logic here
            BankAccount account = new BankAccount(1000); //Initial balance of $1000
            ATM atm = new ATM(account);
            atm.start();
    }  
}
