import java.util.Scanner;

public class guessnumber {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int random = (int)(Math.random() * 100) + 1;
        int guess = 0;

        while (guess != random) {

            System.out.print("Guess a number (1-100): ");
            guess = sc.nextInt();

            if (guess > random) {
                System.out.println("Too High!");
            }
            else if (guess < random) {
                System.out.println("Too Low!");
            }
            else {
                System.out.println("Correct! You guessed the number.");
            }
        }
    }
}