// Class definition; Only 1 class per .java file; Same name for file and class;
public class HelloWorld {
//    Main Method definition; Entry point into application; Other methods and classes will be called from here
    public static void main(String[] args) {
        // This is a 'Statement'
        System.out.println("Hello, World!");

//        ---------------------------------------------------+++++++++++------------------------------------------------
        // Exercise for Syntax, Types, and Variables
        {
            //    Create an int variable named myFavoriteNumber and assign your favorite number to it,
            //    then print it out to the console.
            int myFavoriteNumber = 17;
            System.out.println(myFavoriteNumber);

            //Create a String variable named myString and assign a string value to it, then print the variable out to the console.
            String myString = "Its my string, not yours!";
            System.out.println(myString);

            //Change your code to assign a character value to myString. What do you notice?
            // This cannot be a char to perform a proper coersion, need to go from less to more and widen this value type
            // char myNewString = myString;

            //Change your code to assign the value 3.14159 to myString. What happens?
            // double myString = 3.14159;

            //Declare an long variable named myNumber, but do not assign anything to it. Next try to print out myNumber to the console. What happens?
            // The system does not have an initialized variable to print anything out.
            // long myNumber;
            // System.out.println(myNumber);
            //Change your code to assign the value 3.14 to myNumber. What do you notice?
            // double myNumber = 3.14;
            //Change your code to assign the value 123L (Note the 'L' at the end) to myNumber.
            // int myNumber = (myNumber) 123L;
            //Change your code to assign the value 123 to myNumber.

            //Why does assigning the value 3.14 to a variable declared as a long not compile, but assigning an integer value does?

            //Change your code to declare myNumber as a float. Assign the value 3.14 to it. What happens? What are two ways we could fix this?

            //Copy and paste the following code blocks one at a time and execute them

        }
    }
}
