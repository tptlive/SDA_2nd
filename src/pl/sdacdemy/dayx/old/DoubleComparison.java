package pl.sdacdemy.dayx.old;

public class DoubleComparison {

  public static void main(String[] args) {

    double v = 1.3 / 3.1;
    double v2 = 3.9 / 9.3;

    System.out.println(isEqual(v, v2, 0.000001));
    System.out.println("v2 = " + v2);
    System.out.println("v = " + v);
  }

  public static boolean isEqual(double d1, double d2, double delta) {
    return Math.abs(d1 - d2) < delta;
  }

}
