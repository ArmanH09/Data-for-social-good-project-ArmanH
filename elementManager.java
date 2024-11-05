import java.util.Scanner;

public class elementManager {


  // Traverse the elements array and print out the information of all objects who's group instance variable is equal to the entered group
  public void printByGroup(String group, element[] list) {
    for (int i = 0; i < list.length; i++) {
      if (list[i].getGroup().equals(group)) {
        System.out.println(list[i].getName() + " - " + list[i].getSymbol() + " - " + list[i].getAtomicNumber() + " - " + list[i].getGroup());
      }
    }
  }
  // Traverse the elements array and print out the information of the element who's Atomic Number instance variable is equal to the user entered number
  public void findByNum(int atomicNum, element[] list) {
    System.out.println(list[atomicNum]);
  }
  // Traverse the elements array and print out the information of the element who's name instance variable is equal to the user entered option
  public void findByName(String name, element[] list) {
    for (int i = 0; i < list.length; i++) {
      if (list[i].getName().equals(name)) {
        System.out.println(list[i].getName() + " - " + list[i].getSymbol() + " - " + list[i].getAtomicNumber() + " - " + list[i].getGroup());
      }
    }
  }
  // Traverse the elements array and print out the information of the element who's name instance variable is equal to the user entered symbol
  public void findBySymbol(String symbol, element[] list) {
    for (int i = 0; i < list.length; i++) {
      if (list[i].getSymbol().equals(symbol)) {
        System.out.println(list[i].getName() + " - " + list[i].getSymbol() + " - " + list[i].getAtomicNumber() + " - " + list[i].getGroup());
      }
    }
  }

  // Prints a line to make sections of text esier to read and make the UI look cleaner
  public String printLine() {
    String result = "";
    for (int i = 0; i < 101; i++) {
      result += "-";
    }
    return result;
  }

  // Print the existing groups in the groups list so users can know what valid options work
  public String toString() {
    return "\nHydrogen" + "\nNoble Gas" + "\nAlkali Metals" + "\nAlkali Earth Metals" + "\nMetalloids" + "\nNon-metals" + "\nHalogens" + "\nTransition Metals" + "\nPoor Metals" + "\nRare Earth Metals" + "\nActinide Metals" + "\nSuperheavy Elements";
  }

  public String QuestionS(String prompt) {
    Scanner inputs = new Scanner(System.in);
    System.out.println(prompt);
    String answer = inputs.nextLine();
    System.out.println(printLine());
    return answer;
  }
}