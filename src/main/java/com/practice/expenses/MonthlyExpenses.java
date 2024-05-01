package com.practice.expenses;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class MonthlyExpenses implements Expense {

    private final List<String> expenseList;

    public MonthlyExpenses() {
        expenseList = new ArrayList<>();
    }

    @Override
    public boolean addExpense(int amount) {
        System.out.println("Received expense amount: " + amount);
        StringBuilder expenseBuilder = new StringBuilder();
        String amountStr = expenseBuilder.append("Cash-").append(LocalDateTime.now()).append("-").append(amount).toString();
        return expenseList.add(amountStr);
    }

    @Override
    public void displayExpenses() {

        expenseList.forEach((r) -> System.out.println(r));

    }
}
