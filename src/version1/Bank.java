package version1;

import java.util.ArrayList;
import java.util.List;

public class Bank {
    private String name;
    private List<Customer> customers;

    TextUI ui = new TextUI();

    public Bank(String name) {
        this.name = name;
        customers = new ArrayList<>();
    }
    public void addCustomer(Customer c){
        this.customers.add(c);
    }
    public String toString(){
        String s = "";
        for (Customer c:customers) {
            s+=c+"\n";
        }
        return s;
    }

    public List getCustomers() {
        return customers;
    }

    public void runCreatCustomersDialog(){
        String continueDialog ="Y";
        while (continueDialog.equals("Y")) {
            String name = ui.promptText("Type name of customer");
            int startAmount = ui.promptNumeric("Type how much money");
            Customer c1 = new Customer(name,startAmount);
            customers.add(c1);
            continueDialog = ui.promptText("Do you wish to creat another customer? Y/N");



        }

    }

}
