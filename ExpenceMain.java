package com.expence;

import java.util.Scanner;

public class ExpenceMain {

	 public static void main(String[] args) {
	        ExpenseTracker tracker = new ExpenseTracker();
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.print("Enter expense name: ");
	            String name = sc.nextLine();
	            System.out.print("Enter expense amount: ");
	            double amount = sc.nextDouble();
	            sc.nextLine();
	            tracker.addExpense(new Expense(name, amount));
	            System.out.print("Do you want to add another expense (yes/no)? ");
	            String choice = sc.nextLine();
	            if (!choice.equals("yes")) {
	                break;
	            }
	        }
	        System.out.println("Expenses:");
	        tracker.printExpenses();
	        System.out.println("Total expenses: Rs" + tracker.getTotalExpenses());
	        sc.close();
	    }
}
