import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;

    public class RandomGuesser {
        private static String guess;

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
        static void CreatingFile(){
            try {
                FileWriter fileWriter = new FileWriter("StoredOutput.txt");
                fileWriter.write("Guessed Random Number is: " + guess );
                fileWriter.close();
                System.out.println("the Output is stored successfully ");
            }catch (IOException e)
                {
                    System.out.println("Notification = File is not created.");
            }
        }
//Creating main method and calling the method created above
        public static void main(String[] args) {

            guessgame();
            CreatingFile();
        }
    }
