import java.util.Scanner;
public class ConsoleExercises {

    public static void main(String[] args) {

        {
        // Output: The value of pi is approximately 3.14.
//        double pi = 3.14159;
//        System.out.format("The value of pi is approximately %.2f.", pi);
        }
        {
        // Prompt a user to enter a integer and store that value in an int variable using the nextInt method.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a Integer: ");
//        int userInput = scanner.nextInt();
        }
        {
        // Prompt a user to enter 3 words, and store each of them in a separate variable.
        // Then, display them back in the console, each on a newline.
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter 3 words: ");
//        String userWord1 = scanner.next();
//        String userWord2 = scanner.next();
//        String userWord3 = scanner.next();
//        System.out.format("%s\n%s\n%s\n", userWord1, userWord2, userWord3);
        }
        {
        // Prompt a user to enter a sentence, then store that sentence in a
        // String variable using the next method. Then, display that sentence back to the user.
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String userSentence = scanner.nextLine();
        System.out.format("Your sentence: %s", userSentence);
        }
    }
}
