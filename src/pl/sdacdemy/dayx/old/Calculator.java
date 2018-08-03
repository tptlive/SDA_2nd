package pl.sdacdemy.dayx.old;

public class Calculator {

  public static int sum(int a, int... integers ) {
    int sum = 0;
    for (int integer : integers) {
      sum += integer;
    }
    return sum;
  }

  public static String sum(String... strings) {
    String sum = "";

    for (String string : strings) {
      sum += string;
    }
    return sum;
  }

}
