
import org.junit.jupiter.api.*;

import example.model.AccountHolder;
import example.model.SimpleBankAccountWithATM;

import static org.junit.jupiter.api.Assertions.*;

/**
 * The test suite for testing the SimpleBankAccountTest implementation
 */
class SimpleBankAccountWithATMTest extends SimpleBankAccountTest {

    private final static double FEE_AMOUNT = 1;
    private AccountHolder accountHolder;
    private SimpleBankAccountWithATM bankAccount;

    @BeforeEach
    void beforeEach(){
        accountHolder = new AccountHolder("Mario", "Rossi", FIRST_USER_ID);
        bankAccount = new SimpleBankAccountWithATM(accountHolder, INITIAL_BALANCE);
    }

    @Test
    void testDepositWithATM() {
        bankAccount.depositWithATM(accountHolder.getId(), DEPOSIT_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT - FEE_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWrongDepositWithATM() {
        bankAccount.depositWithATM(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.depositWithATM(SECOND_USER_ID, DEPOSIT_AMOUNT);
        assertEquals(INITIAL_BALANCE + DEPOSIT_AMOUNT - FEE_AMOUNT, bankAccount.getBalance());
    }

    @Test
    void testWithdrawWithATM() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.withdrawWithATM(accountHolder.getId(), WITHDRAW_AMOUNT);
        assertEquals(
            INITIAL_BALANCE + 
                DEPOSIT_AMOUNT - 
                WITHDRAW_AMOUNT - 
                FEE_AMOUNT, 
            bankAccount.getBalance()
        );
    }

    @Test
    void testWrongWithdrawWithATM() {
        bankAccount.deposit(accountHolder.getId(), DEPOSIT_AMOUNT);
        bankAccount.withdrawWithATM(SECOND_USER_ID, WITHDRAW_AMOUNT);
        assertEquals(INITIAL_BALANCE - DEPOSIT_AMOUNT, bankAccount.getBalance());
    }
}
