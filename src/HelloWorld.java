// imports go at the top of your file, before the class definition; This is letting us use the package for Scanner class;
import java.util.Scanner;

// Class definition; Only 1 class per .java file; Same name for file and class;
public class HelloWorld {
//    Main Method definition; Entry point into application; Other methods and classes will be called from here
    public static void main(String[] args) {
        // This is a constant
        final String CONSTANT_STRING = "It is common to see constants named in all caps with underscores separating words";
        // This is a 'Statement'
        System.out.println("Hello, World!: " + CONSTANT_STRING);

        // Casting is coercing a value of one type into another.
        // There are two types of casting, implicit casting and explicit casting.
                                        // Implicit Casting:
        int myIntegerEx = 900;
        long morePrecise = myIntegerEx;
        // In the example above we assigned a value of type int to a variable of type long,
        // which can hold a larger range of values than int can. This is also called a widening conversion.
                                        // Explicit Casting:
        double pi = 3.14159;
        int almostPi = (int) pi;
        // Here we are going from a double, a type that contains information about decimal places in a number,
        // to an int, a type that does not. This is also called a narrowing conversion.

        // Printing data to the console:
        String greeting = "Salutations";
        String name = "codeup";
        System.out.printf("%s, %s!", greeting, name);

                                            // Scanner Class:
        // The Scanner class allows us to get data input that the user enters into the console.

        //Declare type Scanner; Assign to a new Scanner Object; Specify System.in(user information) for source of the scanner;
        Scanner scanner = new Scanner(System.in);
        //Prompt the user for information and the store that information in userInput as its value; nextLine gathers entire string;
        System.out.print("Enter something: ");
        String userInput = scanner.nextLine();
        //Print that user information to the console
        System.out.println("You entered: --> \"" + userInput + "\" <--");


//        ---------------------------------------------------+++++++++++------------------------------------------------
        // Exercise for Syntax, Types, and Variables
        {
            // Create an int variable named myFavoriteNumber and assign your favorite number to it,
            // then print it out to the console.
//            int myFavoriteNumber = 17;
//            System.out.println(myFavoriteNumber);

            // Create a String variable named myString and assign a string value to it, then print the variable out to the console.
//            String myString = "Its my string, not yours!";
//            System.out.println(myString);

            // Change your code to assign a character value to myString. What do you notice?
            // This cannot be a char to perform a proper coersion, need to go from less to more and widen this value type
            // char myNewString = myString;

            // Change your code to assign the value 3.14159 to myString. What happens?
            // double myString = 3.14159;

            // Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
            // The system does not have an initialized variable to print anything out.
//             long myNumber;

            // Change your code to assign the value 3.14 to myNumber. What do you notice?
//            myNumber = 3.14;

            // Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
//             myNumber = 123L;

            // Change your code to assign the value 123 to myNumber.
//            myNumber = 123;
//             System.out.println(myNumber);

            // Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

            // Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?
//            float myNumber = 3.14;

            // Copy and paste the following code blocks one at a time and execute them
//            int x = 5;
//            System.out.println(x++);
//            System.out.println(x);
//
//            int x = 5;
//            System.out.println(++x);
//            System.out.println(x);

//            What is the difference between the above code blocks? Explain why the code outputs what it does.
//
//Try to create a variable named class. What happens?
//            String class = "Class";

//Object is the most generic type in Java. You can assign any value to a variable of type Object. What do you think will happen when the following code is run?

//String theNumberThree = "three";
//Object o = theNumberThree;
//int three = (int) o;

//Copy and paste the code above and then run it. Does the result match with your expectation?
//
//How is the above example different from the code block below?
//
//int three = (int) "three";
//What are the two different types of errors we are observing?
//
//Rewrite the following expressions using the relevant shorthand assignment operators:
//
//int x = 4;
//x += 5;

//int x = 3;
//int y = 4;
//y *=  x;

//int x = 10;
//int y = 2;
//x /= y;
//y -= x;

//What happens if you assign a value to a numerical variable that is larger (or smaller) than the type can hold? What happens if you increment a numeric variable past the type's capacity?

//Hint: Integer.MAX_VALUE is a class constant (we'll learn more about these later) that holds the maximum value for the int type.
//
//[^1]: How many bytes of memory are allocated to store a variable of this data type
        }
    }
}
