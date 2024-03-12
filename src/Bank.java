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
        listOfActions.add("3) Se Kontoposteringer");
        listOfActions.add("4) Indsæt/hæv penge");
        listOfActions.add("5) Opret ny konto");
        listOfActions.add("6) Vælg eksisterende kunde");
        listOfActions.add("7) afslut");
    }
    public void createCustomer(String name, int balance){

        currentCustomer =  new Customer(name, balance);
        this.customers.add(currentCustomer);
    }
    public void userDialog(){
        Main.ui.displayMsg("Velkommen til "+this.name);
        int action = 0;

        while(action != listOfActions.size()){// the quit action is the last action
         action = Main.ui.promptChoice(listOfActions, "Vælg en af følgende:");

         switch(action){
             case 1: //Opret kunde


                  String name =  Main.ui.promptText("Kundens navn: ");
                  this.createCustomer(name, 0);



                 break;
              case 2: // Se kontooversigt
                  //System.out.println(currentCustomer);
                  for(Customer c: customers){
                      System.out.println(c);
                  }


                  break;
             case 3: // Se kontoposteringer
                  break;
             case 4:
                 int amount = Main.ui.promptNumeric("Skriv beløb");
                 currentCustomer.deposit(amount);
                 //Indsæt/Hæv penge
                 break;
             case 5: //Opret ny konto
                 break;
             case 6: //Vælg eksisterende

                 //få bruger til at give id (index) på kunde
                 int index = Main.ui.promptNumeric("Tast kundends ID: ");
                 //hent kunden ud af customersArrayet
                 //sæt currentCusto til denne kunde
                 break;
         }
         Main.saveData(this.customers);
        }


        //  5) create a switch-case statement that looks at the action variable and has a case for each of the 6 first actions in the list of actions



//__________________________________

        // todo:
        //  7) case 2 :
        //  a. display the state of the current customer (defined in the Customer toString method)

        // todo:
        //  8) case 3 :
        //  a. ask the user to choose one of the accounts associated with the current customer
        //  b. use the user input as an argument in a call to the current customer's getAccountDetails account

        // todo:
        //  9) case 4 :
        //  a. ask the user to choose one of the accounts associated with the current customer
        //  b. ask the user to type the amount
        //  c. call the deposit method on the current customer instance with the amount as an argument

        // todo:
        //  10) case 5 :
        //  a. ask the user to type the name of the new account
        //  b. call the createAccount method on the current customer instance with the name as an argument

        // todo:
        //  11) case 6 :
        //  a. ask the user to type the id (index number) of the customer
        //  b. retrieve the customer object from the list of customers and assign it to the currentCustomer attribute of this class

    }
public String toString(){
        String output = "";
        for(Customer c: customers){
            output = c.toString();
        }
        return output;

}


}
