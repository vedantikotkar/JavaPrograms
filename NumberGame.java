import java.util.Random;
import java.util.Scanner;

public class NumberGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random obj = new Random();

        int minRange = 1;
        int maxRange = 100;
        int attempts = 0;
        int score = 0;
        boolean playAgain = true;
        System.out.println("Welcome to our Number Guessing Game...!");

        while (playAgain) {
            int number = obj.nextInt(maxRange - minRange + 1) + minRange;
            int userGuess;
            boolean correctUserGuess = false;
            System.out.println("Number is between range of:" + minRange + "and" + maxRange);
            while (!correctUserGuess && attempts < 10) {
                System.out.println("Enter your guessed  number :");
                userGuess = sc.nextInt();
                attempts++;

                if (userGuess == number) {
                    System.out.println(
                            "congratulations ....! you have guessed correct number in" + attempts + "attempts");
                    score++;
                    correctUserGuess = true;

                } else if (userGuess < number) {
                    System.out.println("Too low ! Try again");
                } else {
                    System.out.println("Too high..!Try again");
                }
            }
            if (!correctUserGuess) {
                System.out.println("Sorry your attempts are over");
            }
            System.out.println("Your score is :" + score);
            System.out.println("Do you want to play again...?    (yes/no) :");
            String playAgainResponse = sc.next().toLowerCase();
            playAgain = playAgainResponse.equals("yes");
            if (playAgain) {
                attempts = 0;
            }
        }
        System.out.println("Thanks for playing..! Your final score is :" + score);
        sc.close();

    }
}