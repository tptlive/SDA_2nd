package pl.sdacdemy.dayx.old;

public class Bottle {

  public static final int PRICE = 10;

  private String name;
  private int volume;

  private static int count = 0;

  public Bottle(String name) {
    this.name = StringUtil.toCamelCase(name);
    this.count++;
  }

  public String getName() {
    return name;
  }

  public int getVolume() {
    return volume;
  }

  public int getCount() {
    return count;
  }

  public void setCount(int count) {
    this.count = count;
  }

  public static int getNumber() {
    return 111;
  }

}
