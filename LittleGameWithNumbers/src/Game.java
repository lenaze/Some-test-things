import java.util.Random;
import java.util.Scanner;

public class Game {
    public static boolean flagWin = false;

    public static void main(String[] args) {
        new Game().runGame();
    }

    private void runGame() {
        Random random = new Random();
        int secret = random.nextInt(1000);
        int tryNumber = -1;
        Scanner scanner = new Scanner(System.in);
        for (int i = 1; i <= 10; i++) {
            System.out.printf("Your try number %d - try to guess: ", i);
            tryNumber = scanner.nextInt();
            if (tryNumber < secret)
                if (i < 10)
                    System.out.println("The secret number is bigger");
            if (tryNumber > secret)
                if (i < 10)
                    System.out.println("The secret number is smaller");
            if (tryNumber == secret) {
                i = stopGame();
                flagWin = true;
            }
        }
        if (flagWin)
            printCongratulations(tryNumber);
        else
            printUpset();
    }

    private void printCongratulations(int number) {
        System.out.println();
        System.out.println("You win!");
        System.out.println("Secret number: " + number);
    }

    private void printUpset() {
        System.out.println();
        System.out.println("You lose!");
    }

    private int stopGame() {
        return 10;
    }
}
