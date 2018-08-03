package pl.sdacdemy.dayx.old;

public class VodkaBottle extends Bottle {

  private int alcoholPercentage;

  public VodkaBottle(String name, int alcoholPercentage) {
    super(name);
    this.alcoholPercentage = alcoholPercentage;
  }

  @Override
  public String getName() {
    return "VODKA!" + super.getName();
  }

  @Override
  public int getVolume() {
    return 100;
  }

  @Override
  public String toString() {
    return "Bottle of " + super.getName() + "(" + alcoholPercentage + ")";
  }

  public static int getNumber() {
    return 222;
  }


}
