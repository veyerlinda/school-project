import java.util.*;

public class RandomNumber {
    public static void main(String[] args) {
        System.out.println(getRandomInt());
    }

    private static int getRandomInt() {
        Random random = new Random();
        return random.nextInt(10);
    }
}