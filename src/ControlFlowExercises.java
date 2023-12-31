import java.util.Scanner;

public class ControlFlowExercises {
   public static void main(String[] args) {
//---------------------------While Loop------------------------------
//     {
       // Create an integer variable i with a value of 5.
//           int i = 5;
       // Create a while loop that runs so long as i is less than or equal to 15
//           while (i <= 15) {
       // Each loop iteration, output the current value of i, then increment i by one.
//               System.out.println(i);
//               i++;
//      }
       {
//---------------------------Do While Loop------------------------------
//Create a do-while loop that will count by 2's starting with 0 and ending at 100. Follow each number with a new line.
//           {
//               int i = 0;
//               do {
//                   System.out.println(i);
//                   i += 2;
//               } while (i <= 100);
//           }

//Alter your loop to count backwards by 5's from 100 to -10.
//           {
//               int i = 100;
//               do {
//                   System.out.println(i);
//                   i -= 5;
//               } while (i >= -10);
//           }

//Create a do-while loop that starts at 2, and displays the
// number squared on each line while the number is less than 1,000,000.
           //Needed to make int variable into a long variable to hold more numerical value
//           {
//               long i = 2;
//               do {
//                   System.out.println(i);
//                   i *= i;
//               } while (i < 1000000);
//           }

//---------------------------For Loop------------------------------
//Refactor the previous two exercises to use a for loop instead
//         #1
//           {
//               for (int i = 5; i <= 15; i ++) {
//                   System.out.println(i);
//               }
//           }
//         #2
//           {
//              { for (int i = 0; i <= 100; i += 2) {
//                   System.out.println(i);
//                } 
//               }
//                {
//                    for (int i = 100; i >= -10; i-= 5) {
//                        System.out.println(i);
//                    }
//                }
//           }

//---------------------------Fizz Buzz------------------------------
// One of the most common interview questions for entry-level programmers is the FizzBuzz test.
// Developed by Imran Ghory, the test is designed to assess basic looping and conditional logic skills.

           //Write a program that prints the numbers from 1 to 100.
           //For multiples of three: print “Fizz” instead of the number.
           //For the multiples of five: print “Buzz”.
           //For numbers which are multiples of both three and five: print “FizzBuzz”.

//           for (int i = 1; i <= 100; i++) {
//               if (i % 3 == 0 && i % 5 == 0) {
//                   System.out.println("FizzBuzz");
//               } else if (i % 3 == 0) {
//                   System.out.println("Fizz");
//               } else if (i % 5 == 0) {
//                   System.out.println("Buzz");
//               } else {
//                   System.out.println(i);
//               }
//           }

//---------------------------Table of Powers------------------------------
    //Prompt the user to enter an integer.
    //Display a table of squares and cubes from 1 to the value entered.
    //Ask if the user wants to continue.
    //Assume that the user will enter valid data.
    //Only continue if the user agrees to.

//           {
//               Scanner scanner = new Scanner(System.in);
//
//               System.out.println("Enter an Integer: ");
//               int userInt = scanner.nextInt();
//
//
//               String tableRow1 = "number | squared | cubed";
//               String tableRow2 = "------ | ------- | -----";
//
//               System.out.println(tableRow1);
//               System.out.println(tableRow2);
//
//               for (int i = 1; i <= userInt; i++) {
//                   int iSquared = i * i;
//                   int iCubed = i * iSquared;
//                   System.out.format("%s      | %s       | %s    \n", i, iSquared, iCubed);
//               }
//           }

//---------------------------Convert given number grades into letter grades------------------------------
    //Prompt the user for a numerical grade from 0 to 100.
    //Display the corresponding letter grade.
    //Prompt the user to continue.
    //Assume that the user will enter valid integers for the grades.
    //The application should only continue if the user agrees to.
           {
               Scanner scanner = new Scanner(System.in);
               System.out.println("Enter a numerical grade between 0 - 100");
               int userEnteredGrade = scanner.nextInt();
               System.out.println("Do you want to continue? (y/n): ");
               String userContinue = scanner.next();

               if (userContinue.equals("y")) {
                   if (userEnteredGrade >= 0 && userEnteredGrade <= 59) {
                       System.out.println("F");
                   }
                   if (userEnteredGrade >= 60 && userEnteredGrade <= 66) {
                       System.out.println("D");
                   }
                   if (userEnteredGrade >= 67 && userEnteredGrade <= 79) {
                       System.out.println("C");
                   }
                   if (userEnteredGrade >= 80 && userEnteredGrade <= 87) {
                       System.out.println("B");
                   }
                   if (userEnteredGrade >= 88 && userEnteredGrade <= 100) {
                       System.out.println("A");
                   }
               } else {
                   System.out.println("User Exited.");
               }
           }
       }
    }
}
