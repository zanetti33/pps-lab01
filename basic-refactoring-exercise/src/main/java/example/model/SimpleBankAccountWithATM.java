package example.model;

public class SimpleBankAccountWithATM extends SimpleBankAccount {

    public SimpleBankAccountWithATM(AccountHolder holder, double balance) {
        super(holder, balance);
    }

    public void depositWithATM(int userID, double amount) {
        if (checkUser(userID)) {
            this.balance += (amount - 1);
        }
    }

    public void withdrawWithATM(int userID, double amount) {
        double amountWithFee = amount + 1;
        if (checkUser(userID) && isWithdrawAllowed(amountWithFee)) {
            this.balance -= amountWithFee;
        }
    }

}
