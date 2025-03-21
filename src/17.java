public class SimpleSchoolProject {
    public static void main(String[] args) {
        // Example of using variables
        String name = "Alice";
        int age = 12;

        // Example of using arrays
        String[] subjects = {"Math", "English", "Science"};
        double[] scores = {85.0, 90.0, 78.0};

        // Example of using loops
        for (int i = 0; i < subjects.length; i++) {
            System.out.println("Subject: " + subjects[i] + ", Score: " + scores[i]);
        }

        // Example of using conditionals
        if (age > 18) {
            System.out.println("You are an adult.");
        } else {
            System.out.println("You are a child.");
        }
    }
}
