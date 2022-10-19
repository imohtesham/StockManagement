public class StockAccount {

    //Modify class Account to provide a method called debit that withdraws money
    //from an Account. Ensure that the debit amount does not exceed the Account’s
    //balance. If it does, the balance should be left unchanged and the method
    //should print a message indicating ―Debit amount exceeded account balance.
    //Modify class AccountTest to test method debit.

    private String customer;
    private double balance = 50000.88;


    public StockAccount() {
        String customer;
        double balance;

    }


    // To Create debit Method
    public double debit() {
        double money = 0;
        if (money > balance) {
            System.out.println("Debit amount exceeded account balance");
            return 0;
        } else {
            balance = balance - money;
            return money;
        }

    }

    public double checkBalance() {
        return this.balance;
    }

}