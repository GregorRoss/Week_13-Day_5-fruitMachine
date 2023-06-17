import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

public class PlayGame {
    static Scanner input = new Scanner(System.in);
    static int winnings = 0;
    static int winningsTotal = 0;
    static Boolean play = true;

    public static void main (String[]args){
        try {
            System.out.println("Please enter number of coins to play: ");
            int numberOfCoins = input.nextInt();
            if (numberOfCoins < 1) {
                throw new InputMismatchException("Sorry you can't play with no coins ");
            }

            FruitMachine FM = new FruitMachine();

                for (int count = 0; count < numberOfCoins * 10; count++) { // 10 spins for each coin
                    ArrayList<Symbols> result = FM.spin();
                    System.out.println("Result: " + result);

                    if (FM.getResult() > 0) {
                        winnings += (FM.getResult() * numberOfCoins);
                        winningsTotal += winnings;
                        System.out.println(
                                "Your winnings are: " + winnings);
                    }

                    if (FM.getResult() == 0) {
                        System.out.println("Sorry no winnings I'm keeping your money!");
                    }

                }

                if (winningsTotal > 0) {
                    System.out.println("----------------------");
                    System.out.println("Your total winnings are: " + winningsTotal);
                }
                System.out.println("-------------------------");
                System.out.println("Insert more coins to play again");
            }

        catch(InputMismatchException inputMismatchException){
            System.out.println("Please enter a valid integer for the number of coins");
        }
    }
}
