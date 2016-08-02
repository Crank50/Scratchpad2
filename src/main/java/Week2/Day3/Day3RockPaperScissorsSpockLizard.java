package Week2.Day3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Justin on 7/20/16.
 */
public class Day3RockPaperScissorsSpockLizard {
    public static Scanner scanner = new Scanner(System.in);
    private static String player1Choice = "";
    private static String player2Choice = "";
    ArrayList<String> names = new ArrayList<>();


    public static void main(String[] args) {
        Day3RockPaperScissorsSpockLizard d3rpssl = new Day3RockPaperScissorsSpockLizard();
        setPlayerChoices();
        decideWinner();
    }


    private static void setPlayerChoices() {

        while (!(player1Choice.equalsIgnoreCase("rock") || player1Choice.equalsIgnoreCase("scissors") || player1Choice.equalsIgnoreCase("paper") || player1Choice.equalsIgnoreCase("lizard") || player1Choice.equalsIgnoreCase("spock"))) {
            System.out.println(" Will you choose Rock, Paper or Scissors? possibly even a lizard or a spock???");
            player1Choice = Day3RockPaperScissors.scanner.nextLine();
        }
        player2Choice = randomSelection();
        System.out.println("Computer has: " + randomSelection());
    }


    private static void decideWinner() {

        if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: Rock vs Computer: Scissors ----rock breaks scissors ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("lizard")) {
            System.out.println(" Player: Rock vs Computer: lizard ---lizard smashed by rock ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: Paper vs Computer: rock ---- paper covers rock------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("spock")) {
            System.out.println(" Player: Paper vs Computer: Spock ---- paper disproves spock------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("lizard")) {
            System.out.println(" Player: Scissors vs Computer: lizard --- scissors slice lizard------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: scissors vs Computer: paper --- scissors cut paper ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("spock") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: spock vs Computer: Scissors --- spock smashes scissors ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("spock") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: spock vs Computer: rock --- spock vaporizes rock ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("lizard") && player2Choice.equalsIgnoreCase("spock")) {
            System.out.println(" Player: lizard vs Computer: spock ---- lizard poisons spock ------Player wins!");
        } else if (player1Choice.equalsIgnoreCase("lizard") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: lizard vs Computer: paper ---- lizard eats paper ------Player wins!");
            //Player 2 begins
        } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("spock")) {
            System.out.println(" Player: Rock vs Computer: spock --- spock vaporizes rock------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("rock") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: Rock vs Computer: paper --- paper covers rock------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("lizard")) {
            System.out.println(" Player: Paper vs Computer: lizard ---- lizard eats paper------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("paper") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: Paper vs Computer: scissors --- scissors cut paper------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("spock")) {
            System.out.println(" Player: Scissors vs Computer: spock --- scissors smashed by spock------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("scissors") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: scissors vs Computer: rock --- rock smashes scissors ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("spock") && player2Choice.equalsIgnoreCase("paper")) {
            System.out.println(" Player: spock vs Computer: paper ---- paper disproved spock ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("spock") && player2Choice.equalsIgnoreCase("lizard")) {
            System.out.println(" Player: spock vs Computer: lizard --- lizard poisons spock ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("lizard") && player2Choice.equalsIgnoreCase("rock")) {
            System.out.println(" Player: lizard vs Computer: rock --- rock smashes lizard ------Computer wins!");
        } else if (player1Choice.equalsIgnoreCase("lizard") && player2Choice.equalsIgnoreCase("scissors")) {
            System.out.println(" Player: lizard vs Computer: scissors --- lizard decapitated by scissors ------Computer wins!");

        } else {
            System.out.println("ITS A TIE!!!!-----/N ----EVERYBODY LOSES! LLLETS PPLAAY AGAIN!");
        }

    }


    public static String randomSelection() {
        int min = 1;
        int max = 5;
        String randomSelection;
        Random random = new Random(System.currentTimeMillis());
        int randomNumber = random.nextInt((max - min) + 1) + min;
        if (randomNumber == 1) {
            randomSelection = "rock";
        } else if (randomNumber == 2) {
            randomSelection = "paper";
        } else if (randomNumber == 3) {
            randomSelection = "Scissors";
        } else if (randomNumber == 4) {
            randomSelection = " lizard";
        } else {
            randomSelection = "spock";
        }
        return randomSelection;
    }
}




   /* Rock breaks scissors
        Rock crushes lizard
        Scissors cut paper
        Scissors decapitate lizard
        Paper covers rock
        Paper disproves Spock
        Lizard eats paper
        Lizard poisons Spock
        Spock smashes scissors
        Spock vaporizes rock*/



