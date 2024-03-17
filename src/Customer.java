public class Customer {
    private String name;
    private int balance;


    public Customer (String name, int startAmount){
        this.name = name;
        this.balance = startAmount;
    }


    public void deposit(int amount){
        this.balance = this.balance + amount;
    }


    public String toString(){
        return this.name +", "+this.balance;
    }

    public int getBalance() {
        return balance;
    }

}
