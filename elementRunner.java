import java.util.Scanner;

public class elementRunner {
  public static void main(String[] args) {


    // Create the 1D arrays for the basic information of all the elements, text files derived from Periodic Table Elements Dataset from code.org AppLab
    String[] namesData = FileReader.toStringArray("Name.txt");
    String[] symbolsData = FileReader.toStringArray("Symbol.txt");
    int[] atomicNumsData = FileReader.toIntArray("AtomicNumber.txt");
    String[] groupsData = FileReader.toStringArray("Group.txt");

    // Create and traverse the AllElements array, with each element instantiating a new element object and assigning instance variables from the 1D arrays we got from out text files
    element[] AllElements = new element[119];
    for (int i = 0; i < namesData.length; i++) {
      AllElements[i] = new element(namesData[i], symbolsData[i], atomicNumsData[i], groupsData[i]);
    }

    // Instantiate a new elementManager Object
    elementManager manager = new elementManager();

    // Instantiate a new scanner object
    Scanner input = new Scanner(System.in);

    // Print out starting choice for user input
    System.out.print("Welcome, what action would you like to preform?" + "\nSearch for specific element or elements (Type 1)" + "\nPrint out all the groups on the periodic table (Type 2)" + "\nPrint out all the elements on the periodic table (Type 3)" + "\n");

    // Get the user input
    int choice1 = input.nextInt();

    // Different code will execute based on user input
    if (choice1 == 1) {
      // Reprompt user with more options and get their input
      System.out.println(manager.printLine());
      System.out.println("Search by Groups (Type 1)" + "\nSearch by Atomic Number (Type 2)" + "\nSearch by Element Name (Type 3)" + "\nSearch by Element Symbol (Type 4)");
      int choice2 = input.nextInt();
      // Different code will execute based on user input
      if (choice2 == 1) {
        // Take user input and find elements with matching group
        manager.printByGroup(manager.QuestionS(manager.printLine() + "\nEnter One of the Following Groups" + manager), AllElements);
      } else if (choice2 == 2) {
        // Take user input and find elements with matching atomic number
        System.out.println(manager.printLine());
        System.out.print("Enter Atomic Number: ");
        int numChoice = input.nextInt();
        System.out.println(manager.printLine());
        manager.findByNum(numChoice, AllElements);
      } else if (choice2 == 3) {
        // Take user input and find elements with matching name
        System.out.println(manager.printLine());
        System.out.print("Enter Element Name: ");
        String nameChoice = input.next();
        System.out.println(manager.printLine());
        manager.findByName(nameChoice, AllElements);
      } else if (choice2 == 4) {
        // Take user input and find elements with matching symbol
        System.out.println(manager.printLine());
        System.out.print("Enter Element Symbol: ");
        System.out.println(manager.printLine());
        String symbolChoice = input.next();
        manager.findBySymbol(symbolChoice, AllElements);
      }
    } else if (choice1 == 2) {
      // Print out all existic groups using manager toString()
      System.out.println(manager.printLine());
      System.out.println("Groups: " + manager);
    } else if (choice1 == 3) {
      // Print out every existing element in the periodic table starting from the 1st element
      System.out.println(manager.printLine());
      for (int i = 1; i < AllElements.length; i++) {
        System.out.println(AllElements[i]);
      }
    }
  }
}