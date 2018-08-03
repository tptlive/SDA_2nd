package pl.sdacdemy.dayx.old;

import java.util.Arrays;
import java.util.Collections;

public class TwoDimensionalArrays {

  public static void main(String[] args) {

    Integer[] integers = new Integer[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    Collections.shuffle(Arrays.asList(integers));
    for (int integer : integers) {
      System.out.println("integer = " + integer);
    }
    System.out.println("---------------------------------------------------");
    for (int i = 0; i < integers.length; i++) {
      System.out.println("integer = " + integers[i]);
    }

    int[][] integerTable = new int[10][10];
    int[][] integerTable2 = new int[][]{
        {1, 2, 3, 4, 5, 56, 76},
        {1, 2, 3, 4, 5, 56, 76},
        {1, 2, 3, 4, 5, 56, 76},
        {1, 2, 3, 4, 5, 56, 76},
        {1, 2, 3, 4, 5, 56, 76}
    };

    int[][] dirs = new int[][]{
        {0, -1},
        {1, 0},
        {0, 1},
        {-1, 0}
    };

    System.out.println("---------------------------------------------------");

    for (int i = 0; i < integerTable2.length; i++) {
      for (int j = 0; j < integerTable2[i].length; j++) {
        if (i == j) {
          integerTable2[i][j] = 1;
        }
        System.out.print(integerTable2[i][j] + " ");
      }
      System.out.println();
    }

  }

}
