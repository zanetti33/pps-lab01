
import org.junit.jupiter.api.*;

import example.model.AccountHolder;
import example.model.BankAccount;
import example.model.SimpleBankAccountWithATM;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccountTest implementation
 */
class SimpleBankAccountWithATMTest {

    private AccountHolder accountHolder;
    private SimpleBankAccountWithATM bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", 1);
        bankAccount = new SimpleBankAccountWithATM(accountHolder, 0);
    }

    @Test
    void testDepositWithATM() {
        bankAccount.depositWithATM(accountHolder.getId(), 100);
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWrongDepositWithATM() {
        bankAccount.depositWithATM(accountHolder.getId(), 100);
        bankAccount.depositWithATM(2, 50);
        assertEquals(99, bankAccount.getBalance());
    }

    @Test
    void testWithdrawWithATM() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdrawWithATM(accountHolder.getId(), 70);
        assertEquals(29, bankAccount.getBalance());
    }

    @Test
    void testWrongWithdrawWithATM() {
        bankAccount.deposit(accountHolder.getId(), 100);
        bankAccount.withdrawWithATM(2, 70);
        assertEquals(100, bankAccount.getBalance());
    }
}
