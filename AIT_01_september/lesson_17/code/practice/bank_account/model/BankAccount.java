package practice.bank_account.model;

public class BankAccount {
    //поля - переменные - класса
    private long id;
    private String owner;
    private String bankName;
    private int branch;
    private double balance;

    //тип счёта, валюта, адрес, контактные данные, возраст, паспортные данные


    //конструкторы класса
    //контруктор на все поля
    public BankAccount(long id, String owner, String bankName, int branch, double balance) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
    }

    public BankAccount(long id, String owner, String bankName, int branch) {
        this.id = id;
        this.owner = owner;
        this.bankName = bankName;
        this.branch = branch;
        balance = 0.0;
    }

    // конструктор для анонимного клиента
    public BankAccount(long id, String bankName, int branch, double balance) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;
        this.balance = balance;
        owner = "Anonimous";
    }
    //неполный конструктор без денег и владельца


    public BankAccount(long id, String bankName, int branch) {
        this.id = id;
        this.bankName = bankName;
        this.branch = branch;

    }

    public void display() {
        System.out.println("acc: " + id + ", owner: " + owner + ", bank: " + bankName + ", balance: " + balance);
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public int getBranch() {
        return branch;
    }

    public void setBranch(int branch) {
        this.branch = branch;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    //положить деньги на счёт
    public boolean deposit(double sum) {
        balance = balance + sum;
        return true;
    }

    //снять деньги со счёта
    public boolean withdrow (double sum) {
        if (sum <= balance) {
            balance = balance - sum;
            return true;
        }
       return false;
    }


}






