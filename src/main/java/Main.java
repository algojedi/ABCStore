import java.util.*;
import java.lang.*;

public class Main {
    public static void main(String args[]) {
        System.out.println("hello world!");
    }

/**    Write a program that prompts a user for a
    number and then checks to see if that number
    is divsible by 3, by 5, or both 3 and 5.
    If it is divisible by 3, then the word "foo"
    should be printed out. If it is divisible by 5,
    then print out "baz". And, if it is divisible by
    both 3 and 5, then "foobaz" should be
    printed out. It should not print out foo, baz,
    and foobaz if it is divisble by both 3 and 5. */

    public void foobaz(){
        // Create a Random object
        Random random = new Random();
        // Generate a random number between 1 and 100 (inclusive)
        int randomNumber = random.nextInt(100) + 1;
        // Print the random number
        System.out.println("Random number between 1 and 100: " + randomNumber);

        System.out.println("foobaz");
    }
}
