abstract class Cube {

  public abstract int getVolume();

  public int square(int x) {
    return x * x;
  }

  public int add(int x, int y) {
    return x + y;
  }

  public static int subtract(int x, int y) {
    return x - y;
  }

  public static int multiply(int x, int y) {
    return x * y;
  }

  public static int divide(int x, int y) {
    return x / y;
  }
}

public class Cubes {
  public static void main(String[] args) {
    // Demonstrate default methods
    Cube cube = new Cube() {
      public int getVolume() {
        return 1;
      }
    };
    int result = cube.square(5);
    System.out.println("Square: " + result);
    result = cube.add(5, 10);
    System.out.println("Add: " + result);

    // Demonstrate static methods
    result = Cube.subtract(10, 5);
    System.out.println("Subtract: " + result);
    result = Cube.multiply(5, 10);
    System.out.println("Multiply: " + result);
    result = Cube.divide(10, 5);
    System.out.println("Divide: " + result);
  }
}
