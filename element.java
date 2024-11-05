import java.util.Scanner;

public class element {

  // Instance variables for basic values of the element
  private String Name;
  private String Symbol;
  private int AtomicNumber;
  private String Group;

  // No parameter instructor for 0th element
  public element() {
    Name = "Unexistium";
    Symbol = "?";
    AtomicNumber = 0;
    Group = "N/A";
  }

  // Parameterized contrusctor for the 1st to 118th elements
  public element(String Name, String Symbol, int AtomicNumber, String Group) {
    this.Name = Name;
    this.Symbol = Symbol;
    this.AtomicNumber = AtomicNumber;
    this.Group = Group;
  }

  // returns element name
  public String getName() {
    return Name;
  }

  // returns element symbol
  public String getSymbol() {
    return Symbol;
  }

  // returns element atomic number
  public int getAtomicNumber() {
    return AtomicNumber;
  }

  // returns the group the element belongs in
  public String getGroup() {
    return Group;
  }

  // returns basic information about a certain element
  public String toString() {
    return Name + " - " + Symbol + " - " + AtomicNumber + " - " + Group;
  }
}