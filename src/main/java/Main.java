import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  private Map<String, String> contacts;

  public Main() {
    contacts = new HashMap<>();
  }

  // use object orientated programmging structure

  public void addContact(String name, String phoneNumber) { // the method is visible and can be called from outside the class
    contacts.put(name, phoneNumber);
    System.out.println("Contact added: " + name + " - " + phoneNumber);
  }

  public void searchByName(String name) { // the method is visible and be calle dfrom outside the clas
    String phoneNumber = contacts.get(name); // initilize string
    if(phoneNumber != null) {
      System.out.println("Phone number for " + name + ": " +phoneNumber); // print System.out.println statement
    } else {
      System.out.println("Contact not found: " + name);
    }
  }

  public void deleteContact(String name) { // the method is visible and be called from outside the class
    String phoneNumber = contacts.remove(name);
    if (phoneNumber != null) {
      System.out.println("Contact deleted: " + name);
    } else {
      System.out.println("Contact not found: " + name);
    }
  }

  public static void main(String[] args) {
    Main Main = new Main();
    Scanner scanner = new Scanner(System.in); // Scanner class in Java. Ask for user input
    while (true) {  // While true loop in java. infinite loop in java while boolean is tru
      System.out.println("\nAddress Book Menu:");
      System.out.println("1. Add Contact");
      System.out.println("2. Search by Name");
      System.out.println("3. Delete Contact");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline
      switch (choice) { // initialize switch statement in java is a multi-way branch statement
        case 1: // case keyword in java
          System.out.print("Type name (Enter name): ");
          String name = scanner.nextLine(); 
          System.out.print("Type Phone Number: ");
          String phoneNumber = scanner.nextLine();
          Main.addContact(name, phoneNumber);
          break;
        case 2:
          System.out.print("Enter name to search: ");
          String searchName = scanner.nextLine();
          Main.searchByName(searchName);
          break;
        case 3:
          System.out.print("Type name to delete: ");
          String deleteName = scanner.nextLine();
          Main.deleteContact(deleteName);
          break;
        case 4:
          System.out.println("Exiting...");
          System.exit(0);
          break;
        default:
          System.out.println("Invalid Choice!");
      }
    }
  }
}
      
