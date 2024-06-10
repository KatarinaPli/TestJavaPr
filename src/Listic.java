import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.Scanner;

public class Listic {
    ArrayList<String> listAnimals = new ArrayList<>();
    Scanner scan = new Scanner(System.in);
    public void addAnimals(){
        while (true) {
            System.out.print("Enter animal name: ");
            String name = scan.nextLine();

            if (name.equalsIgnoreCase("Hhhh")) {
                break;
            }
            listAnimals.add(name);
        }
    }

    public void displayZoo (){
        System.out.println("You have such an animals in your zoo: " + listAnimals);
    }


}
