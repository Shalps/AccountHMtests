package Accounts;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SimpleAccountTest {

    private SimpleAccount account;

    @BeforeEach
    void setUp() {
        account = new SimpleAccount();
    }


    @Test
    void constructorZeroBalanceTest(){
        assertEquals(0,account.getBalance());
    }

    @Test
    void addPositiveAmountShouldIncreaseBalanceTest() {
        boolean result = account.add(100);
        assertTrue(result);
        assertEquals(100,account.getBalance());
    }

    @Test
    void payTest() {
        account.add(300);
        boolean pay = account.pay(150);
        assertTrue(pay);
        assertEquals(150,account.getBalance());


    }

    @Test
    void getBalanceTest() {
        account.add(100);
        assertEquals(100,account.getBalance());
    }
}