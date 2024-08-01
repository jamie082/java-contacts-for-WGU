import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
  private Map<String, String> contacts;

  public Main() {
    contacts = new HashMap<>();
  }

  // use object orientated programmging structure

  public void insertContact(String name, String phoneNumber) {
    contacts.put(name, phoneNumber);
    System.out.println("Contact added: " + name + " - " + phoneNumber);
  }

  public void searchContact(String name) {
    String phoneNumber = contacts.get(name);
    if(phoneNumber != null) {
      System.out.println("Phone number for " + name + ": " +phoneNumber);
    } else {
      System.out.println("Contact not found: " + name);
    }
  }

  public void deleteContact(String name) {
    String phoneNumber = contacts.remove(name);
    if (phoneNumber != null) {
      System.out.println("Contact deleted: " + name);
    } else {
      System.out.println("Contact not found: " + name);
    }
  }

  public static void main(String[] args) {
    Main Main = new Main();
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("\nAddress Book Menu:");
      System.out.println("1. Add Contact");
      System.out.println("2. Search by Name");
      System.out.println("3. Delete Contact");
      System.out.println("4. Exit");
      System.out.print("Enter your choice: ");
      int choice = scanner.nextInt();
      scanner.nextLine(); // Consume newline
      switch (choice) {
        case 1:
          System.out.print("Type name (Enter name): ");
          String name = scanner.nextLine();
          System.out.print("Type Phone Number: ");
          String phoneNumber = scanner.nextLine();
          Main.insertContact(name, phoneNumber);
          break;
        case 2:
          System.out.print("Enter name to search: ");
          Main searchName = scanner.nextLine();
          Main.searchContact(searchName);
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
      
