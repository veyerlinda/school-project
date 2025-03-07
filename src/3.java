import java.util.*;

public class SchoolProject {
  public static void main(String[] args) {
    // Print a message to the console
    System.out.println("Hello, World!");

    // Initialize an array with some numbers
    int[] numbers = new int[5];
    for (int i = 0; i < numbers.length; i++) {
      numbers[i] = (int) (Math.random() * 10);
    }

    // Print the array to the console
    System.out.println(Arrays.toString(numbers));
  }
}
