package pl.sdacdemy.dayx;

public class Main {

  public static void main(String[] args) {
    // Ctrl + Alt + V - creates a variable
    Person johnSmith = new Person("John Smith");
    Person sarahConnor = new Person("sarah Connor");

    johnSmith.setFirstName("patrick");

    System.out.println(johnSmith.getFullName());

    System.out.println(sarahConnor.getFullName());
  }

}
