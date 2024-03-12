import utils.UI;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    static UI ui = new UI();
    static String path = "data/customers.csv";

    public static void main(String[] args) {
       Bank bank = new Bank("Lollandsbanken");

        File file = new File(path);
        try {
            Scanner scan = new Scanner(file);
            scan.nextLine();//skip header

            while(scan.hasNextLine()){
                String s = scan.nextLine(); // "tess, 40000"
                String[] line= s.split(",");
                String name = line[0];
                int balance = Integer.parseInt(line[1].trim());
                bank.createCustomer(name,balance);

            }

        }catch(FileNotFoundException e){
            System.out.println("File was not found");
        }

        bank.userDialog();
    }


    public static void saveData(ArrayList<Customer> customers) {


        try {
            FileWriter writer = new FileWriter(path);
            writer.write("Name, Balance\n"); //Giv csv filen en header
            for (Customer c: customers) {
               writer.write(c+"\n"); //"Tess, 40000";
            }
            writer.close();
        }catch (IOException e){

        }
    }
}