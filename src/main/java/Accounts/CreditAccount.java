package Accounts;

public class CreditAccount  extends Account{



    long creditLimit;

    public CreditAccount( long creditLimit) {
        super(creditLimit,0);
        this.creditLimit = creditLimit;
    }



    @Override
    public boolean add(long amount) {
        return false;
    }

    @Override
    public boolean pay(long amount) {
        if (creditLimit>0){
            creditLimit-=amount;
            return true;
        }
        return false;
    }


    @Override
    public long getBalance() {
        return  creditLimit;
    }
}
