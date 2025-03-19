import java.util.Scanner;

public class SchoolProject {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        int sum = 0;
        for (int i = 1; i <= num2; i++) {
            if (num1 % i == 0) {
                sum++;
            }
        }
        System.out.println("The number of divisors of " + num1 + " is " + sum);
    }
}
