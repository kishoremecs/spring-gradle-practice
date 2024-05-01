package com.practice.config;

import com.practice.expenses.Expense;
import com.practice.expenses.MonthlyExpenses;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BasicAppConfig {

    @Bean
    public String basicAppName() {
        return "Hello World App in Gradle";
    }

    @Bean
    public Expense monthlyExpense() {
        return new MonthlyExpenses();
    }


}
