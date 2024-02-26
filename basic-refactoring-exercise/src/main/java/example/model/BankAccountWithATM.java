package example.model;

public interface BankAccountWithATM extends BankAccount {
    
    /**
     * Allows the deposit of an amount on the account through ATM, if the given userID corresponds to the register holder ID
     * of the bank account. This ID acts like an "identification token" .
     * Some fee may be applied.
     *
     * @param userID the id of the user that wants do the deposit
     * @param amount the amount of the deposit
     */
    public void depositWithATM(int userID, double amount);

    /**
     * Allows the withdrawal of an amount from the account, if the given userID corresponds to the register holder ID
     * of the bank account. This ID acts like an "identification token" .
     * Some fee may be applied.
     *
     * @param userID the id of the user that wants do the withdrawal
     * @param amount the amount of the withdrawal
     */
    public void withdrawWithATM(int userID, double amount);

}
