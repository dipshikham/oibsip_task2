import java.util.Scanner;
public class num_guess
{
    public static void guessingNumberGame()
    {
        Scanner sc = new Scanner(System.in);
        int number = 1 + (int)(100 * Math.random());
        int K = 0;
        int guess;
        while(K<10)
        {
            System.out.println("Guess the number:");
            guess = sc.nextInt();
            if (number == guess)
            {
                System.out.println("Congratulations! You guessed the number.");
                K += 1;
                System.out.println("You got it right in " + K + " trials.");
                System.out.println("Your score is " + ((10 - K) * 10) + ".");
                break;
            }
            else if (number > guess)
            {
                System.out.println("The number is greater than " + guess);
                K += 1;
            }
            else
            {
                System.out.println("The number is less than " + guess);
                K += 1;
            }
        }
        System.out.println("Your guess is complete!");
    }
    public static void main(String[] arg)
    {
        System.out.println("This is a number guessing game where you have to guess a number from 1 to 100 within 10 trials.");
        System.out.println("How many rounds do you want to play? ");
        Scanner sc = new Scanner(System.in);
        int round = sc.nextInt();
        int a = 0;
        while(round != a)
        {
            System.out.println("Round " + (a + 1) + ":");
            guessingNumberGame();
            a += 1;
            System.out.println("Thank you!");
            System.out.println();
        }
    }
}