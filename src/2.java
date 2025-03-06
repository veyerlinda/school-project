import java.util.*;
public class RandomNumber {
public static void main(String[] args) {
// Generate a random number between 1 and 10
Random rand = new Random();
int num = rand.nextInt((10 - 1) + 1) + 1;
System.out.println("A random number between 1 and 10 is: " + num);
}
}