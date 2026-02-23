import Accounts.CreditAccount;
import Accounts.SimpleAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        SimpleAccount simpleAccount = new SimpleAccount();
        CreditAccount creditAccount = new CreditAccount(100_000);

        creditAccount.add(10_000);
        creditAccount.pay(20_000);

        simpleAccount.add(100);
        simpleAccount.add(1000);
        simpleAccount.pay(200);

        simpleAccount.transfer(creditAccount,2000);

        long balance = creditAccount.getBalance();
        System.out.println(balance);
        long i = simpleAccount.getBalance();
        System.out.println(i);


    }
}