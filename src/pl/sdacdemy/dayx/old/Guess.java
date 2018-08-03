package pl.sdacdemy.dayx.old;

import java.util.Random;
import java.util.Scanner;

public class Guess {

  public static void main(String[] args) {
    Random random = new Random();
    int bound = 10000;
    int secret = random.nextInt(bound + 1);
    int min = 0;
    int max = bound;
    int attempt = 0;
    Scanner scanner = new Scanner(System.in);
    while (true) {
      System.out.println("attempt " + ++attempt + ":");
      int input = scanner.nextInt();

      if (input < secret) {
        min = input;
        System.out.println("too low (" + (min + max) / 2 + ")");
      } else if (input > secret) {
        max = input;
        System.out.println("too high (" + (min + max) / 2 + ")");
      } else {
        System.out.println("BINGO! " + attempt + " attempts");
        return;
      }
    }

  }

}
