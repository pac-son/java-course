public class HelloDemo {

  public static void main(String[] args) {
    System.out.println("Hello, World!");
    //System.out.println("our lord is good");
    //long x = 12300339399393399L;
    //System.out.println("My number is: "+x);

    String x = "water";
    String y = "Kool-aid";
    String temp;


    temp = x;
    x = y;
    y = temp;

    System.out.println("x: "+x);
    System.out.println("y: "+y);
  }
}