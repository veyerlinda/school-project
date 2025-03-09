import java.util.Random;
public class RandomNumber {
  public static void main(String[] args) {
    int lowerBound = 10; // lower bound of random number range
    int upperBound = 20; // upper bound of random number range
    Random rnd = new Random();
    int randomNum = rnd.nextInt(upperBound - lowerBound + 1) + lowerBound;
    System.out.println(randomNum);
  }
}
