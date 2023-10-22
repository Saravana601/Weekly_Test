package com.geekster.ExpenseTrackerAPI.repository;

import com.geekster.ExpenseTrackerAPI.model.Expense;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDate;
import java.util.List;

public interface IExpenseRepository extends JpaRepository<Expense,Long> {
    List<Expense> findAllByDate(LocalDate date);

    List<Expense> findByDateBetween(LocalDate startOfMonth, LocalDate endOfMonth);
}
