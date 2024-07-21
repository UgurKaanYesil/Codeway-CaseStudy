# Dice Rolling Game

This is a simple Java program that simulates a dice rolling game played between three players. The program allows the user to specify the target number of rounds and then simulates each round, displaying the results in a tabular format.

## How to Run the Program

1. **Clone the repository or download the `DiceGame.java` file**.

2. **Compile the Java program**:
    ```bash
    javac DiceGame.java
    ```

3. **Run the compiled Java program**:
    ```bash
    java DiceGame
    ```

## Program Description

1. **Input**: The program asks for the target number of rounds. The user must enter a number between 1 and 99. If the user enters an invalid number, the program will continue to prompt the user until a valid number is entered.

2. **Initialization**: At the beginning of the game, all three players start with a total score of 0.

3. **Rolling the Dice**: In each round, each of the three players rolls a dice, resulting in a random number between 1 and 6.

4. **Scoring Rules**:
    - If all three players roll the same number, that number is added to the total score of each player.
    - If all three players roll different numbers, each player's rolled number is added to their respective total score.
    - If two players roll the same number and the third player rolls a different number:
        - The two players with the same number are rewarded with twice the number they rolled if it is greater than the third player's number; otherwise, the rolled number is added to their score.
        - The third player's rolled number is added to their score.

5. **Output**: The program prints the results of each round in a tabular format with the following columns:
    - Round Number
    - Dice 1 (Player 1's roll)
    - Dice 2 (Player 2's roll)
    - Dice 3 (Player 3's roll)
    - Total 1 (Player 1's total score)
    - Total 2 (Player 2's total score)
    - Total 3 (Player 3's total score)

6. **Game End**: The game ends when the target number of rounds is reached. The final scores of all three players are displayed.




## Notes

- The game ensures that the user enters a valid number of rounds (between 1 and 99).
- Each player's score is updated according to the rules described above.
- The program displays the results of each round in a tabular format for easy readability.

Enjoy the game!
