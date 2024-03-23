public class Account {

    private String customerName;
    private int id;
    private double balance;
    private double annualInterestRate;
    private double withdrawLimit = 0;

    public Account(int _id, String _customerName) {
        id = _id;
        customerName = _customerName;
    }

    public double getWithdrawLimit() {
        return withdrawLimit;
    }
    private void setWithdrawLimit() {
        withdrawLimit = 0.2 * balance;
    }
    public String getCustomerName() {
        return customerName;
    }
    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
        setWithdrawLimit();
    }
    public double getAnnualInterestRate() {
        return annualInterestRate;
    }
    public void setAnnualInterestRate(double annualInterestRate) {
        this.annualInterestRate = annualInterestRate;
    }

    public void deposit(int money) {
        balance += money;
        setWithdrawLimit();
    }

    public void withdraw(int money) {
        if (money < balance && money < withdrawLimit) {
            balance -= money;
            setWithdrawLimit();
        }
        else {
            System.out.println("Error: you don't have that much money in your account!");
        }

    }

    @Override
    public String toString() {
        return "I am an account!";
    }
}