package version1;
import java.util.ArrayList;
import java.util.Scanner;


public class TextUI {
    Scanner scan = new Scanner(System.in);


    public String promptText(String msg) {
        System.out.println(msg); //Stille brugeren et spørgsmål
        String input = scan.nextLine();          //Give brugere et sted at placere sit svar og vente på svaret//Konvertere svaret til et tal
        return input;
    }

    public int promptNumeric(String msg) {
        System.out.println(msg); //Stille brugeren et spørgsmål
        String input = scan.nextLine();          //Give brugere et sted at placere sit svar og vente på svaret
        int number = Integer.parseInt(input);       //Konvertere svaret til et tal
        return number;
    }

    public ArrayList<String> promptChoice(ArrayList<String> options, int limit, String msg) {
        ArrayList<String> choices = new ArrayList<String>();

        while(choices.size() < limit) {             //tjekke om brugeren skal vælge flere drinks
            String choice = promptText("");
            choices.add(choice);
        }
        return choices;
    }

    public void displayList(ArrayList<String> options, String msg) {
        System.out.println(msg);
        for (String option : options) {
            System.out.println(option);
        }
    }

}