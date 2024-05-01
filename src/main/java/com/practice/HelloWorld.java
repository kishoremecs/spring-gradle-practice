package com.practice;

import java.time.LocalTime;

import com.practice.config.BasicAppConfig;
import com.practice.expenses.Expense;
import org.springframework.context.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class HelloWorld {
    public static void main(String[] args) {
        LocalTime currentTime = LocalTime.now();
        System.out.println("The current local time is: " + currentTime);

        Greeter greeter = new Greeter();
        System.out.println(greeter.sayHello());

        ApplicationContext ctx = new AnnotationConfigApplicationContext(BasicAppConfig.class);
        String appName = (String) ctx.getBean("basicAppName");
        Expense monthlyExpenses = ctx.getBean(Expense.class);

        System.out.println(appName);

        monthlyExpenses.addExpense(100);
        monthlyExpenses.addExpense(97);
        monthlyExpenses.addExpense(80);
        monthlyExpenses.displayExpenses();



    }
}