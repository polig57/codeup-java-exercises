import java.util.Scanner;

public class MethodsExercises {
    public static long getAddition (int num1, int num2) {
        return num1 + num2;
    }
    public static long getSubtraction(int num1, int num2) {
        return num1 - num2;
    }
    public static long getMultiplication(long num1, long num2) {
        return num1 * num2;
    }
    public static long getDivision(long num1, long num2) {
        return num1 / num2;
    }
    public static int getInteger(int min, int max) {
        System.out.println("Enter a number between 1 - 10");
        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();


        if(userInput <= 1 && userInput >= 10) {
            return userInput;
        } else System.out.println("Bye.");
        return userInput;
    }
    public static void main(String[] args) {
        System.out.println(getAddition(1, 5));
        System.out.println(getSubtraction(1, 5));
        System.out.println(getMultiplication(1, 5));
        System.out.println(getDivision(20, 2));
        getInteger(1, 10);
    }

}
