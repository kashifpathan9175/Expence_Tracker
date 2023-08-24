package com.expence;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseTracker {
    private ArrayList<Expense> expenses;

    public ExpenseTracker() {
        expenses = new ArrayList<Expense>();
    }

    public void addExpense(Expense expense) {
        expenses.add(expense);
    }

    public void printExpenses() {
        for (Expense expense : expenses) {
            System.out.println(expense.toString());
        }
    }

    public double getTotalExpenses() {
        double total = 0;
        for (Expense expense : expenses) {
            total += expense.getAmount();
        }
        return total;
    }

   
}



