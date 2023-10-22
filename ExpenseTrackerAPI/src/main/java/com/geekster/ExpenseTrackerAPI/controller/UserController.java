package com.geekster.ExpenseTrackerAPI.controller;

import com.geekster.ExpenseTrackerAPI.controller.dto.SignInDto;
import com.geekster.ExpenseTrackerAPI.model.Expense;
import com.geekster.ExpenseTrackerAPI.model.User;
import com.geekster.ExpenseTrackerAPI.service.AuthenticationService;
import com.geekster.ExpenseTrackerAPI.service.ExpenseService;
import com.geekster.ExpenseTrackerAPI.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDate;
import java.util.List;

@RestController
@RequestMapping("user")
public class UserController {

    @Autowired
    UserService userService;

    @Autowired
    AuthenticationService authenticationService;

    @Autowired
    ExpenseService expenseService;

    @PostMapping("/signUp")
    public String signUp(@RequestBody User user) {
        return userService.userSignUp(user);
    }

    @PostMapping("/signIn")
    public String signIn(@RequestBody SignInDto signInDto){
        return userService.userSignIn(signInDto);
    }

    @DeleteMapping("/signOut")
    public String signOut(@RequestParam String email, @RequestParam String tokenValue) {
        return userService.userSignOut(email,tokenValue);
    }

    @PostMapping("expense")
    public String createExpense(@RequestParam String email, @RequestParam String tokenValue, @RequestBody Expense expense) {
         if(!authenticationService.authenticate(email,tokenValue)) {
             return "Please sign in to Create Expense";
         }

         return expenseService.createExpense(expense);
    }


    @GetMapping("expense")
    public List<Expense> getAllExpenses(@RequestParam String email, @RequestParam String tokenValue) {
        if(!authenticationService.authenticate(email,tokenValue)) {
            return null;
        }

        return expenseService.getAllExpenses();
    }

    @PutMapping("expense/{expenseId}")
    public String updateExpenseById(@RequestParam String email, @RequestParam String tokenValue, @PathVariable Long expenseId, @RequestBody Expense updatedExpense) {
        if(!authenticationService.authenticate(email,tokenValue)) {
            return null;
        }

        return expenseService.updateExpenseById(expenseId, updatedExpense);
    }

    @DeleteMapping("expense/{expenseId}")
    public String deleteExpenseById(@RequestParam String email, @RequestParam String tokenValue, @PathVariable Long expenseId) {
        if(!authenticationService.authenticate(email,tokenValue)) {
            return null;
        }

        return expenseService.deleteExpenseById(expenseId);
    }

    @GetMapping("/expenses/{date}")
    public List<Expense> getAllExpenseByDate(@RequestParam String email, @RequestParam String tokenValue, @PathVariable("date") @DateTimeFormat(pattern = "yyyy-MM-dd") LocalDate date) {
        if(!authenticationService.authenticate(email,tokenValue)) {
            return null;
        }

        return expenseService.getAllExpenseByDate(date);
    }

    @GetMapping("totalExpenseInMonth")
    public Double calculateTotalExpenditureForMonth(@RequestParam int year, @RequestParam int month) {
        return expenseService.calculateTotalExpenditureForMonth(year,month);
    }
}
