import java.util.Scanner;
// import java.util.*; 
import java.util.HashMap; // Key index operations like updation, deletion etc is easier!

// GAME INDEX //
// playName : The player's name  
// playChoice : The player's choice (Rock, paper or Scissors)
// compChoice : The computer's automated choice (Rock, paper or Scissors)
// Computer player name: 'Robo'
// scoreBoard : Maintaining scores
// Tie : Both choose the same option
// Scores get updated every game (till we say 'y' to continue), until the player decides to quit('n') the game.


// (if you're trying this on online compiler, this might make it easier)
// class Main 

class RPS 

{
  private static final int ROCK = 1;

  private static final int PAPER = 2;

  private static final int SCISSORS = 3;

  public static void main(String[] args) 
  {

    Scanner sc = new Scanner(System.in);

    HashMap<String, Integer> scoreBoard = new HashMap<>();

    System.out.println("This is the Rock-Paper-Scissors Game!!");

    System.out.print("Kindly enter your name: ");

    String playName = sc.nextLine();

    scoreBoard.put(playName, 0);

    while (true) 
    {

      System.out.println("Enter your choice: ");

      System.out.println("1. Rock");

      System.out.println("2. Paper");

      System.out.println("3. Scissors");

      System.out.print("Enter your choice from (1-3): ");

      int playChoice = sc.nextInt();

      int compChoice = (int) (Math.random() * 3 + 1); //To generate random choices
      
      System.out.println("\n" + playName + " chose " + playChoice + " and Robo chose " + compChoice);

      String winner = "Tie ";
      
      if (playChoice == ROCK && compChoice == PAPER) 
      {
        winner = "Robo";
      } 
      else if (playChoice == ROCK && compChoice == SCISSORS) 
      {
        winner = playName;
      } 
      else if (playChoice == PAPER && compChoice == ROCK) 
      {
        winner = playName;
      } 
      else if (playChoice == PAPER && compChoice == SCISSORS) 
      {
        winner = "Robo";
      } 
      else if (playChoice == SCISSORS && compChoice == ROCK) 
      {
        winner = "Robo";
      } 
      else if (playChoice == SCISSORS && compChoice == PAPER) 
      {
        winner = playName;
      }

      System.out.println("\n" + winner + " won this round!");

      if (winner.equals(playName)) 
      {
        scoreBoard.put(playName, scoreBoard.get(playName) + 1);
      }

      System.out.println("\nHigh Scores:");

      for (String name : scoreBoard.keySet()) // stores key elements
      {
        System.out.println(name + ": " + scoreBoard.get(name));
      }

      System.out.print("\nWanna play the game again? (y/n)");

      sc.nextLine();

      String playAgain = sc.nextLine();

      if (!playAgain.equalsIgnoreCase("y")) 
      {
        break;
      }

    }
  }
}
