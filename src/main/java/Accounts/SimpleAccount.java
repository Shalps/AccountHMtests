package Accounts;

public class SimpleAccount extends Account {


    public SimpleAccount() {
        super(0L, 0L);
    }

    @Override
    public boolean add(long amount) {

        if (amount > 0) {
            moneybag += amount;
            return true;
        } else return false;

    }

    @Override
    public boolean pay(long amount) {

        if (amount > 0 && amount <= moneybag) {
            moneybag -= amount;
            return true;
        }
        return false;
    }



    @Override
    public long getBalance() {
        return moneybag;
    }



}
