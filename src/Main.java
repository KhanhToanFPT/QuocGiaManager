
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

/**
 *
 * @author admin
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Controller control = new Controller();
       Validation vl = new Validation();
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("1. Add country information");
            System.out.println("2. Display country information");
            System.out.println("3. Search country by name");
            System.out.println("4. Display sorted country names");
            System.out.println("5. Exit");
            

            int choice = vl.menu("Choose an option:");
           
            switch(choice){
                case 1 :
                    control.addCountry();
                    break;
                case 2:
                    control.addDefaultCountries();
                    control.display();
                    break;
                case 3 :
                    control.searchCountry();
                    break;
                case 4 :
                    control.sortInformationByAscendingOrder();
                    break;
                case 5 :
                    System.out.println("Exiting the program. Goodbye!");
                    System.exit(0);
                    break;
                    default:
            }   System.out.println("Choiagain");
            continue;
            
    }
    
}
}
