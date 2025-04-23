// ------------------------Input Output-----------------------------

// Question 1 :- Complete the function printNumber which takes an integer input from the user and prints it on the screen.
 
// Answer 1:-
package Step1Basics.Lec1ThingsToKnow;
import java.util.Scanner;
class UserInputOutput{
  public static void main(String[]args){
    int number;
    Scanner input=new Scanner(System.in);
    System.out.println("Enter integer value ");
    number=input.nextInt();
    System.out.println("The number is "+number);
    input.close();
  }
}