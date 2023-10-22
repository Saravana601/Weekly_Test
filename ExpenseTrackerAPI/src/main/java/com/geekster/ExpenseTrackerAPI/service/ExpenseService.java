package com.geekster.ExpenseTrackerAPI.service;

import com.geekster.ExpenseTrackerAPI.model.Expense;
import com.geekster.ExpenseTrackerAPI.repository.IExpenseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDate;
import java.util.List;

@Service
public class ExpenseService {

    @Autowired
    IExpenseRepository iExpenseRepository;


    // create expense
    public String createExpense(Expense expense) {
        iExpenseRepository.save(expense);
        return "Expense created successfully";
    }

    // get all expenses
    public List<Expense> getAllExpenses() {
        return iExpenseRepository.findAll();
    }

    // update expense by expense I'd
    public String updateExpenseById(Long expenseId, Expense updatedExpense) {
        Expense existingExpense = iExpenseRepository.findById(expenseId).orElseThrow();
        existingExpense.setTitle(updatedExpense.getTitle());
        existingExpense.setDescription(updatedExpense.getDescription());
        existingExpense.setPrice(updatedExpense.getPrice());
        existingExpense.setDate(updatedExpense.getDate());
        iExpenseRepository.save(existingExpense);

        return "Expense updated successfully";
    }

    // delete expense by expense I'd
    public String deleteExpenseById(Long expenseId) {
        iExpenseRepository.deleteById(expenseId);
        return "Expense deleted successfully";
    }

    // returns all expenses based on date
    public List<Expense> getAllExpenseByDate(LocalDate date) {
        return iExpenseRepository.findAllByDate(date);
    }

    // calculates month expenses
    public Double calculateTotalExpenditureForMonth(int year, int month) {
        LocalDate startOfMonth = LocalDate.of(year, month, 1);
        LocalDate endOfMonth = startOfMonth.plusMonths(1).minusDays(1);

        List<Expense> expenses = iExpenseRepository.findByDateBetween(startOfMonth, endOfMonth);
        double totalExpenditure = 0.0;

        for (Expense expense : expenses) {
            totalExpenditure += expense.getPrice();
        }

        return totalExpenditure;
    }

}
