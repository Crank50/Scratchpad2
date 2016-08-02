package Week2.Day3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Justin on 7/20/16.
 */
public class Day3RockPaperScissors {

    public static Scanner scanner = new Scanner(System.in);
    ArrayList<String> names = new ArrayList<>();
    private String player1Choice = "";
    private String player2Choice = "";

    public static void main(String[] args) {
        Day3RockPaperScissors d3rps = new Day3RockPaperScissors();
        d3rps.setPlayerChoices();
        d3rps.decideWinner();
    }

    public static String randomSelection() {
        int min = 1;
        int max = 3;
        String randomSelection;
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        if (randomNumber == 1) {
            randomSelection = "rock";
        } else if (randomNumber == 2) {
            randomSelection = "paper";
        } else {
            randomSelection = "Scissors";
        }
        return randomSelection;
    }

    private void setPlayerChoices() {

        while (!(player1Choice.equalsIgnoreCase("rock") || player1Choice.equalsIgnoreCase("scissors") || player1Choice.equalsIgnoreCase("paper"))) {
            System.out.println(" Will you choose Rock, Paper or Scissors?");
            player1Choice = Day3RockPaperScissors.scanner.nextLine();
        }
        player2Choice = randomSelection();
        System.out.println("Computer has: " + randomSelection());
    }


    //    (rule: paper beats Rock)
    //    (rule: scissors beats Paper)

    // Print out who won in this format: "Player: ROCK vs Computer: SCISSORS ----- PLAYER WINS"


    // How will you make computer's selection random?

    private void decideWinner() {
        // Using the rules of Rock-Paper-Scissors, decide which player wins
        //    (rule: rock beats scissors)
        if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: Rock vs Computer: Scissors ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: scissors vs Computer: paper ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: Rock vs Computer: Scissors ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: Rock vs Computer: Scissors ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: Rock vs Computer: Scissors ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: Rock vs Computer: Scissors ------Computer wins!");
        } else {
            System.out.println("ITS A TIE!!!!-----/N ----EVERYBODY LOSES! LLLETS PPLAAY AGAIN!");
        }
    }
}


// ask player 1 for their choice of rock paper scissors

//the game should randomely select the computers selection

// the game then outputs who won in this format: "Player: rock vs Computer : scissors ----- Player wins

// rock beats scissors

// paper beats rock

// scissors beats paper






