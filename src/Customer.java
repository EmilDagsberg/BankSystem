public class Customer {
    //todo: add attributes as per the class diagram
        private String name;
        private Account currentAccount;
        public Customer(String name){
             this.name = name;
             currentAccount = new Account("Lønkonto");
        }

        public Customer (String name, int startbalance){
            this.name = name;
            currentAccount = new Account("Lønkonto");
            currentAccount.setBalance(startbalance);
        }

    //todo: write the contructor
    //  1) assign a value to the name attribute
    //  2) initialize the ArrayList
    //  3) create a new Account instans and assign it to the currentAccount attribute
    //  4) add the account to the list of accounts

    //todo: write the deposit method
    // 1) increment the balance with the passed value (will be negative if it's a withdrawal)
     public void deposit(int amount){
            int newBalance = this.currentAccount.getBalance() + amount;
            this.currentAccount.setBalance(newBalance);

    }
    // todo: write the createAccount method
    //  1) create a new Account instance and add it to the list of accounts


    // todo: write the getAccountNames method
    //  1) initialize a local ArrayList of strings. Call it 'accountNames'
    //  2) construct a for-each loop running through the list of accounts
    //  3) add each account's name to the local 'accountNames' list
    //  4) return the list


    // todo:  write the getAccountDetails method
    //  1) use the passed id to retrieve an account from the list of accounts
    //  2) call the account's toString method and assign the return value to local String variable
    //  3) return the String variable


    //todo: override the toString method
    // 1) initialize a local string variable with the name attribute followed by a new line
    // 2) construct a for-each loop running through the list of accounts
    // 3) call each account's toString method and append the return value to the string variable (use the increment operator +=)
    // 4) return the string variable

    public String toString(){

            return this.name +", "+this.currentAccount.getBalance();
    }

    //todo: write the setCurrentAccount method
    // 1) assign the passed value to the currentAccount attribute

}
