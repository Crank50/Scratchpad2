package Week2.Day3;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

/**
 * Created by Justin on 7/20/16.
 */
public class D3RPCRobotmode {
    public static Scanner scanner = new Scanner(System.in);
    ArrayList<String> wins = new ArrayList<>();
    ArrayList<String> tools = new ArrayList<>();
    private String playerChoice;
    private String Computer;


//    public static int counter = 0;
//    public static int turns = 1000;
//    public static int p1wins = 0;
//    public static int p2wins = 0;
//    public static int ties = 0;
//    public static int scissors = 0;
//    public static int paper = 0;
//    public static int rock = 0;
//    private String player1Choice = "";
//    private String player2Choice = "";

    public static void main(String[] args) {

        D3RPCRobotmode D3rp = new D3RPCRobotmode();
        for (int i = 0; i < 1000; i++) {
            D3rp.setPlayers();
            D3rp.decideWinner();
        }
        System.out.println("********************************************************");
        System.out.println("************************Stats***************************");
        System.out.println("********************************************************");
        D3rp.playerWinnercount();

//            D3RPCRobotmode robotmode = new D3RPCRobotmode();
//            robotmode.setPlayerChoicesRobot();

//        System.out.println("p1 wins: " + p1wins);
//        System.out.println("p2 wins: " + p2wins);
//        System.out.println("ties!: " + ties);
//        System.out.println("rock: " + rock);
//        System.out.println("paper: " + paper);
//        System.out.println("scissors: " + scissors);

    }


    private void setPlayers() {


        System.out.println("Press [enter} to begin the path of a 1000 deaths kinda...");

        playerChoice = randomSelection();
        System.out.println("Player 1 has: " + randomSelection());

        Computer = randomSelection();
        System.out.println("Computer has: " + randomSelection());

    }

    private void decideWinner() {
        String WinnerAnnouncement;
        String Winner;

        if (playerChoice.equalsIgnoreCase("rock") && Computer.equalsIgnoreCase("scissors")) {
            WinnerAnnouncement = " rock crushes scissors player  WINS";
            Winner = "player";
            // System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer 2 wins!");
            //         p1wins++;
            //            rock++;
        } else if (playerChoice.equalsIgnoreCase("scissors") && Computer.equalsIgnoreCase("paper")) {
            WinnerAnnouncement = "scissors cut paper player Wins";
            Winner = "player";
            //  System.out.println(" Computer 2: scissors vs Computer: paper ------Computer 2 wins!");
            //            p1wins++;
            //            scissors++;
        } else if (playerChoice.equalsIgnoreCase("paper") && Computer.equalsIgnoreCase("rock")) {
            WinnerAnnouncement = "paper Covers rock player Wins";
            Winner = "player";
            //   System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer 2 wins!");
            //            p1wins++;
            //            paper++;
        } else if (playerChoice.equalsIgnoreCase("rock") && Computer.equalsIgnoreCase("paper")) {
            WinnerAnnouncement = "paper covers rock computer Wins";
            Winner = "computer";
            //  System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            //            p2wins++;
            //            rock++;
        } else if (playerChoice.equalsIgnoreCase("paper") && Computer.equalsIgnoreCase("scissors")) {
            WinnerAnnouncement = "scissors cut paper computer Wins";
            Winner = "computer";
            //  System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            //            p2wins++;
            //            paper++;
        } else if (playerChoice.equalsIgnoreCase("scissors") && Computer.equalsIgnoreCase("rock")) {
            WinnerAnnouncement = "scissors crushed by rock computer Wins";
            Winner = "computer";
            //  System.out.println(" Computer 2: Rock vs Computer: Scissors ------Computer wins!");
            //            p2wins++;
            //            scissors++;
        } else {
            WinnerAnnouncement = "Its a Tie!";
            Winner = "Tie";

            //  System.out.println("ITS A TIE!!!!");
            //            ties++;
        }
        System.out.println(WinnerAnnouncement);
        wins.add(Winner);
    }

    private void playerWinnercount() {
        int playerwins = 0;
        int computerwins = 0;
        int tie = 0;
        for (String winner : wins) {
            switch (winner) {
                case "player":
                    playerwins++;
                    break;
                case "computer":
                    computerwins++;
                    break;
                default:
                    tie++;
                    break;
            }
        }

        System.out.println("Player has won: " + playerwins + " times.");
        System.out.println("Computer has won: " + computerwins + " times.");
        System.out.println("There were " + tie + " ties");
        int rockcount = 0;
        int papercount = 0;
        int scissorcount = 0;
        for (String tool : tools) {
            switch (tool) {
                case "rock":
                    rockcount++;
                    break;
                case "paper":
                    papercount++;
                    break;
                case "scissors":
                    scissorcount++;
                    break;
            }
        }
        System.out.println(" Rock was used " + rockcount + " times.");
        System.out.println(" Paper was used " + papercount + " times.");
        System.out.println(" Scissor was used " + scissorcount + " times.");
    }

    public String randomSelection() {
        int low = 1;
        int high = 3;
        String randomSelection;
        // Random random = new Random(System.currentTimeMillis());
        Random random = new Random();
        int randomNumber = random.nextInt((high - low) + 1) + low;
        if (randomNumber == 2) {
            randomSelection = "rock";

        } else if (randomNumber == 3) {
            randomSelection = "paper";

        } else {
            randomSelection = "scissors";
        }
        tools.add(randomSelection);
        return randomSelection;
    }
}




    // Track which player wins most often

    //Track which choice wins most often
    //Using dynamic data structures, track every game (hint: ArrayList)
    //Print your results to the screen


// Instead of asking the player for their choice, have the computer automatically randomly select both the player and computer
//   Auto run the simulation 1000 times
// Track which player wins most often
//Track which choice wins most often
//Using dynamic data structures, track every game (hint: ArrayList)
//Print your results to the screen


