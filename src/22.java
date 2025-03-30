public class SimpleSchoolProject {
    public static void main(String[] args) {
        // Example usage of Java methods and classes.
        System.out.println("Hello, World!");
        int age = 18;
        String name = "Alice";
        int height = 59; // in centimeters
        boolean isStudent = true;
        double gradePointScore = 3.7;
        
        // Example of calling a method using parameters and return type.
        int result = calculateGradePointScore(age, height, isStudent, gradePointScore);
        
        System.out.println("Result: " + result);
    }
    
    private static int calculateGradePointScore(int age, double height, boolean isStudent, double gradePointScore) {
        // Example code for calculating the score based on parameters.
        if (isStudent && age >= 18 && height > 170 && gradePointScore >= 4.0) {
            return 5;
        } else if (!isStudent && age >= 18 && height > 160) {
            return 3;
        }
        
        // Example of calling a static method.
        return (int) Math.round((age - 18) * 1.2 + height / 10) + gradePointScore / 10;
    }
}
