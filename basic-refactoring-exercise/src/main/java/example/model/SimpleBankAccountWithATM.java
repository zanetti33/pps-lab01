package example.model;

public class SimpleBankAccountWithATM extends SimpleBankAccount implements BankAccountWithATM {

    private final int ATM_FEE = 1;

    public SimpleBankAccountWithATM(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    @Override
    public void depositWithATM(int userID, double amount) {
        if (checkUser(userID)) {
            this.balance += (amount - ATM_FEE);
        }
    }

    @Override
    public void withdrawWithATM(int userID, double amount) {
        double amountWithFee = amount + ATM_FEE;
        if (checkUser(userID) && isWithdrawAllowed(amountWithFee)) {
            this.balance -= amountWithFee;
        }
    }

}
