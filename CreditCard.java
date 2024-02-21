public class CreditCard {
    private String customer;
    private String bank;
    private String account;
    private int limit;
    private double balance;
    public CreditCard(
        String customer,
        String bank,
        String account,
        int limit,
        double balance){
            this.customer = customer;
            this.bank = bank;
            this.account = account;
            this.limit = limit;
            this.balance = balance;
        }
    public String getCustomer()
    {
        return customer;
    }
    public String getbank(){
        return bank;
    }
    public String getAccount(){
        return account;
    }
    public int getLimit(){
        return limit;
    }
    public double getBalance(){
        return balance;
    }
    public boolean charge(double price){
        if(price + balance > limit){
            return false;
        } else {
            balance += price;
            return true;
        }
    }
    
    public void makePayment(double amount){
        if(amount < 0){
            System.out.println("payment amount must be positive");
            return;
        }
        if(balance - amount < 0)
        {System.out.println("payment of "+ amount+" exceeds current balance of");
    balance = 0.0;}
        else{
        System.out.println("Accepting payment of" + amount);
        System.out.println("Previous Balance: "+ balance);
        balance -= amount;
        System.out.println("Current Balance: "+ balance);
    }
    if(balance == 0){
        System.out.println("No more due payments");
        }
    }
}