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
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a sentence: ");
//        String userSentence = scanner.nextLine();
//        System.out.format("Your sentence: %s", userSentence);
        }
        {
                // Calculate the perimeter and area of a room.
// Prompt the user to enter values of length and width of a room (or your room if virtual).
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Values of LENGTH and WIDTH of a Room");

// Use the nextLine method each time you need to get user input.
        String userInputLength = scanner.nextLine();
        String userInputWidth = scanner.nextLine();



// In this case, we need it twice, once to get the user input for the length and again to get the user input for the width.
    // Parse the resulting strings to a numeric type.
        int userRoomArea = Integer.parseInt(userInputLength) * Integer.parseInt(userInputWidth);
        int userRoomPerimeter = (Integer.parseInt(userInputLength) * 2) + (Integer.parseInt(userInputWidth) * 2);

        System.out.println("Area of the Room is: " + userRoomArea);
        System.out.println("Perimeter of the Room is: " + userRoomPerimeter);

    // Assume that the rooms are perfect rectangles.
    // Assume that the user will enter valid numeric data for length and width.
    // Display the area and perimeter of that classroom.
    // The area of a rectangle is equal to the length times the width,
    // and the perimeter of a rectangle is equal to 2 times the length plus 2 times the width.





        }
    }
}
