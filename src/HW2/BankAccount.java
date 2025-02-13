package HW2;

public class BankAccount {
    private int acctNumber;
    private int balance;
    private double interestRate;

    /**
     * Constructor for creating an Account object with
     * default values for the fields.
     */
    public BankAccount() {
        balance = 0;
        acctNumber = 0;
        interestRate = .25;
    }

    public BankAccount(int initAcctNumber, float initInterestRate) {
        acctNumber = initAcctNumber;
        balance = 0;
        interestRate = initInterestRate;
    }

    /**
     * set the account number
     * @param acct the new account number
     */
    public void setAccountNumber(int acct) {
        acctNumber = acct;
    }
    
    /**
     * get the account number
     * @return the account number
     */
    public int getAccountNumber() {
        return acctNumber;
    }
    
    /**
     *  deposit money into the account
     *  @param depAmount the amount to deposit
     */
    public void deposit(int depAmount) {
        balance = balance + depAmount;
    }
    
    /** 
     * withdraw money from the account
     * @param withAmount the amount to withdraw
     */
    public void withdraw(int withAmount) {
         balance = balance - withAmount;
    } 
  
    /** 
     * check the account balance (an accessor method)
     * @return the account balance
     */
    public int getBalance() {
        return balance;
    }
    /**
     * check the interestRate and returns it
     * 
     */
    public double getInterestRate(){
        return interestRate;

    }
    /**
     * returns the current balance in dollar form
     */
    public int getDollars(){
        return balance/100;
    }
    /**
     * calculates the reward amount and adds it to the balance
     */

     public void addRewardsAmount(){
        int rewardAmount = balance/100;
        balance = balance + rewardAmount;

     }
    
    /**
     * display the account number and balance on the screen
     */
    public void print() {
        System.out.println("Account number: " + acctNumber);
        System.out.println("Balance is: " + balance + " cents.");
    }

}
