import java.util.Scanner;
import java.util.Random;

    public class RandomGuesser {
//creating method
        public static void guessgame() {


//Create a scanner object to read
            Scanner game = new Scanner(System.in);

//Create a random object
            Random rand = new Random();

//Identifier declarations
            int num = rand.nextInt(100) + 1;
            int guess = 0;
            int count = 0;
            int guesses = 0;

            do {
                System.out.println("Guess what number I have (1-100)? ");
                guess = game.nextInt();
                guesses++;

                if (num < guess) {
                    System.out.println("Too high, try again.");
                } else if (num > guess) {
                    System.out.println("Too low, try again.");
                } else {
                    System.out.println("You're right, the number is" + num);
                    System.out.println("You guessed" + guesses + "times");
                }
            }
            while (guess != num);
        }


        public static void main(String[] args) {

            guessgame();
        }
    }
