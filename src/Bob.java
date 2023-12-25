import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {
//        Bob is a lackadaisical teenager. In conversation, his responses are very limited.
//Bob answers 'Sure.' if you ask him a question. (the input ends with a question mark)
//He answers 'Whoa, chill out!' if you yell at him. (the input ends with an exclamation mark)
//He says 'Fine. Be that way!' if you address him without actually saying anything. (empty input)
//He answers 'Whatever.' to anything else.
//Write the Java code necessary so that a user of your command line application can have a conversation with Bob.
        Scanner scanner = new Scanner(System.in);

//        ----------------------------------Initial Conversation Dialog------------------------------------------
        System.out.println("It's Bob...");
        System.out.println("Do you want to have a conversation with Bob?: (y/n)");
        String userContinue = scanner.nextLine();
//        ----------------------------------Logic to have conversation with Bob------------------------------------------
        if (userContinue.equals("y")) {
            System.out.println("Bob: ...");
            String userConveration = scanner.nextLine();
//        ----------------------------------Logic during conversation with Bob------------------------------------------
            if (userConveration.endsWith("?")) {
                System.out.println("Sure.");
            } else if (userConveration.endsWith("!")) {
                System.out.println("Whoa, chill out!");
            } else if (userConveration.isEmpty()) {
                System.out.println("Fine. Be that way!");
            } else {
                System.out.println("Whatever");
            }
        } else {
            System.out.println("peace");
        }
    }
}
