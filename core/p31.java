package com.core;

import java.util.Scanner;
class InsufficientBalanceException extends Exception {
    InsufficientBalanceException(String msg) {
        super(msg);
    }
}
public class p31 {
	 public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);

	        int balance = 2000;
	        System.out.println("Account balance is: " + balance);

	        System.out.print("Enter withdraw amount: ");
	        int withdraw = sc.nextInt();

	        try {
	            if (withdraw > balance) {
	                int need = withdraw - balance;
	                throw new InsufficientBalanceException(
	                    "Sorry, insufficient balance, you need more " + need + " Rs. To perform this transaction."
	                );
	            } else {
	                balance = balance - withdraw;
	                System.out.println("Withdraw Successful!");
	                System.out.println("Remaining balance: " + balance);
	            }
	        } catch (InsufficientBalanceException e) {
	            System.out.println(e.getMessage());
	        }
	    }
}
