import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int targetRounds;
        while (true) {
            System.out.print("Enter the target number of rounds (1-99): ");
            targetRounds = scanner.nextInt();
            if (targetRounds >= 1 && targetRounds <= 99) {
                break;
            } else {
                System.out.println("Invalid number! Please enter a number between 1 and 99.");
            }
        }

        int player1Points = 0, player2Points = 0, player3Points = 0;

        // Table headers
        System.out.printf("%-10s %-10s %-10s %-10s %-10s %-10s %-10s\n", "Round", "Dice 1", "Dice 2", "Dice 3", "Total 1", "Total 2", "Total 3");

        for (int round = 1; round <= targetRounds; round++) {
            int player1Roll = random.nextInt(6) + 1;
            int player2Roll = random.nextInt(6) + 1;
            int player3Roll = random.nextInt(6) + 1;

            if (player1Roll == player2Roll && player2Roll == player3Roll) {
                player1Points += player1Roll;
                player2Points += player1Roll;
                player3Points += player1Roll;
            } else if (player1Roll != player2Roll && player2Roll != player3Roll && player1Roll != player3Roll) {
                player1Points += player1Roll;
                player2Points += player2Roll;
                player3Points += player3Roll;
            } else {
                if (player1Roll == player2Roll) {
                    if (player1Roll > player3Roll) {
                        player1Points += player1Roll * 2;
                        player2Points += player2Roll * 2;
                    } else {
                        player1Points += player1Roll;
                        player2Points += player2Roll;
                    }
                    player3Points += player3Roll;
                } else if (player1Roll == player3Roll) {
                    if (player1Roll > player2Roll) {
                        player1Points += player1Roll * 2;
                        player3Points += player3Roll * 2;
                    } else {
                        player1Points += player1Roll;
                        player3Points += player3Roll;
                    }
                    player2Points += player2Roll;
                } else if (player2Roll == player3Roll) {
                    if (player2Roll > player1Roll) {
                        player2Points += player2Roll * 2;
                        player3Points += player3Roll * 2;
                    } else {
                        player2Points += player2Roll;
                        player3Points += player3Roll;
                    }
                    player1Points += player1Roll;
                }
            }

            // Print round results as a table
            System.out.printf("%-10d %-10d %-10d %-10d %-10d %-10d %-10d\n", round, player1Roll, player2Roll, player3Roll, player1Points, player2Points, player3Points);
        }

        System.out.println("Game over!");
        System.out.printf("Final Scores: Player 1: %d, Player 2: %d, Player 3: %d\n", player1Points, player2Points, player3Points);
        scanner.close();
    }
}
