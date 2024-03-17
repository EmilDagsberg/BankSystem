import java.util.ArrayList;

public class Bank {
 private String name;
 private ArrayList<Customer> customers;
 private ArrayList<String> listOfActions;
 private Customer currentCustomer;

    public Bank(String name){
        this.name = name;
        customers = new ArrayList<>();
        listOfActions = new ArrayList<>();
        listOfActions.add("1) Opret kunde");
        listOfActions.add("2) Vis kunder");
        listOfActions.add("3) Indsæt/hæv penge");
        listOfActions.add("4) afslut");
    }
    public void createCustomer(){
        String input =  Main.ui.promptText("Kundens navn: ");
        currentCustomer =  new Customer(input, 0);
        this.customers.add(currentCustomer);
    }
    public void runDialog(){
        Main.ui.displayMsg("Velkommen til "+this.name);
        int action = 0;

        while(action != listOfActions.size()){// the quit action is the last action
         action = Main.ui.promptChoice(listOfActions, "Vælg en af følgende:");

         switch(action){
             case 1:
                 //Opret kunde

                  this.createCustomer();
                  break;
              case 2:
                  // Vis kunder
                  displayCustomers();
                  break;
             case 3:
                  //Indsæt/Hæv penge
                  int amount = Main.ui.promptNumeric("Skriv beløb");
                  currentCustomer.deposit(amount);
                  break;
         }
         Main.saveData(this.customers);
        }


        //  5) create a switch-case statement that looks at the action variable and has a case for each of the 6 first actions in the list of actions


    }

public void displayCustomers(){
 for(Customer c: customers){
        System.out.println(c);
    }
}


}
