package pl.sdacdemy.dayx.old;

public class Main2 {

  public static void main(String[] args) {
    int result = Calculator.sum(12);
    System.out.println(result);

    int result2 = Calculator.sum(17, 33, 50);
    System.out.println(result2);

    int result3 = Calculator.sum(1,2,3,4,4,5,6,7,8,98,7,6,5,43,4,43,43,543,5,435,34,543,5);
    System.out.println(result3);

    String sumOfString = Calculator.sum("asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa","asdsa", "dasds", "dasdsa", "sadsa");
    System.out.println(sumOfString);

    Bottle finlandia = new VodkaBottle("Finlandia", 40);
    System.out.println(finlandia.getName());

    System.out.println(finlandia.getNumber());

    System.out.println(VodkaBottle.getNumber());
    System.out.println(Bottle.getNumber());
//    Bottle bottle1 = new Bottle("a");
//    Bottle bottle2 = new Bottle("b");
//    Bottle bottle3 = new Bottle("c");
//    Bottle bottle4 = new Bottle("d");
//
//    System.out.println(bottle1.getName() + " - " + bottle1.getCount());
//    System.out.println(bottle2.getName() + " - " + bottle2.getCount());
//    bottle3.setCount(10);
//    System.out.println(bottle3.getName() + " - " + bottle3.getCount());
//    System.out.println(bottle4.getName() + " - " + bottle4.getCount());
//    System.out.println(bottle1.getName() + " - " + bottle1.getCount());
//    System.out.println(bottle2.getName() + " - " + bottle2.getCount());
//
//
////    System.out.println(Bottle.getVolume());
//    System.out.println(bottle1.getVolume());
//
//    String input1 = "what a great day to be alive";
//    String input1CamelCased = StringUtil.toCamelCase(input1);
//    String input2CamelCased = StringUtil.toCamelCase("hello world");
//
//    System.out.println(Bottle.PRICE);

  }

}
