package HW2;
import static org.junit.Assert.*;

import org.junit.Test;

public class BankAccountTest {

    @Test
    public void testSetAccountNumber(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.setAccountNumber(10);
        assertEquals(10,myAcc.getAccountNumber());

    }

    @Test
    public void getAccountNumber () {
        BankAccount myAcc = new BankAccount(10, 0);
        assertEquals(10,myAcc.getAccountNumber());
    }

    @Test 
    public void testDeposit(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.deposit(100);
        assertEquals(100, myAcc.getBalance());
    }

    @Test
    public void testWithdraw(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.deposit(100);
        myAcc.withdraw(50);
        assertEquals(50, myAcc.getBalance());
    }

    @Test
    public void testGetBalance(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.deposit(100);
        assertEquals(100, myAcc.getBalance());
    }

    
    @Test
    public void testGetInterestRate(){
        BankAccount myAcc = new BankAccount(0, 0);
        assertEquals(0, myAcc.getInterestRate(),.01);
    }

    @Test
    public void testPrint(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.setAccountNumber(123);
        myAcc.deposit(100);
        myAcc.print();

    }

    @Test
    public void testGetDollars(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.deposit(800);
        assertEquals(8, myAcc.getDollars());
        BankAccount myAcc2 = new BankAccount(0, 0);
        assertEquals(0, myAcc2.getDollars());
    }

    @Test
    public void testAddRewardAmount(){
        BankAccount myAcc = new BankAccount(0, 0);
        myAcc.deposit(500);
        myAcc.addRewardsAmount();
        assertEquals(505, myAcc.getBalance()); 
    }
    
}
