package com.architha.test;

import org.junit.Before;
import org.junit.After;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 * Author: Architha Sree
 * Superset ID: 6375089
 * Purpose: Test using Arrange-Act-Assert pattern with setup/teardown
 */

public class BankAccountTest {

    private BankAccount account;

    // SETUP – runs before each test
    @Before
    public void setUp() {
        account = new BankAccount("Architha", 1000);
        System.out.println(">> Setup complete");
    }

    // TEARDOWN – runs after each test
    @After
    public void tearDown() {
        account = null;
        System.out.println(">> Teardown complete");
    }

    // TEST 1 - Deposit
    @Test
    public void testDeposit() {
        // Arrange is already done in setUp

        // Act
        account.deposit(500);

        // Assert
        assertEquals(1500, account.getBalance(), 0);
    }

    // TEST 2 - Withdrawal
    @Test
    public void testWithdraw() {
        account.withdraw(300);
        assertEquals(700, account.getBalance(), 0);
    }
}

// Sample BankAccount class for testing
class BankAccount {
    private String owner;
    private double balance;

    public BankAccount(String owner, double balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public void deposit(double amount) {
        balance += amount;
    }

    public void withdraw(double amount) {
        if (amount <= balance)
            balance -= amount;
    }

    public double getBalance() {
        return balance;
    }
}

