package Accounts;

public abstract class Account {

   protected long moneybag;
   protected  long amount;

    public Account(long moneybag, long amount) {
        this.moneybag = moneybag;
        this.amount = amount;
    }

  public   abstract boolean add(long amount);

 public   abstract boolean pay(long amount);

    public boolean transfer(Account account, long amount) {
        if (amount>0){
            account.pay(amount);
            moneybag+=amount;
            return true;
        }
        return false;
    }

   public  abstract long getBalance();
}
