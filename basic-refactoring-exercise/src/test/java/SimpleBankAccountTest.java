import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccount;

import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccount implementation
 */
class SimpleBankAccountTest {

    protected static final double DEPOSIT_AMOUNT = 100;
    protected static final double INITIAL_BALANCE = 0;
    protected static final int FIRST_USER_ID = 1;
    protected static final int SECOND_USER_ID = 2;
    protected static final double WITHDRAW_AMOUNT = 70;
    protected AccountHolder accountHolder;
    protected BankAccount bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", FIRST_USER_ID);
        bankAccount = new SimpleBankAccount(accountHolder, INITIAL_BALANCE);
    }

    @Test
    void testInitialBalance() {
        assertEquals(INITIAL_BALANCE, bankAccount.getBalance());
    }

    @Test
    void testDeposit() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWrongDeposit() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.deposit(SECOND_USER_ID, DEPOSIT_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWithdraw() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.withdraw(accountHolder.getId(), WITHDRAW_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT - WITHDRAW_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdraw() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.withdraw(SECOND_USER_ID, WITHDRAW_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT, bankAccount.getBalance());
    }
}
