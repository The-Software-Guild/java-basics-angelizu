package Exercise1;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {

        int maxRounds = 10;
        int minRounds = 1;
        int totalRounds = 0;
        int userRounds;

        // whether user wants to play rock paper scissors
        int userChoice;
        String playAgain;

        Random random = new Random();
        String[] rps = {"Rock", "Paper", "Scissors"};

        // keeping track of state of the game
        int userWins = 0;
        int ties = 0;
        int pcWins = 0;
        boolean play = true;

        //loop the game while the boolean play is still true
        while (play) {
            System.out.print("How many rounds do you want to play? ");
            Scanner userInput = new Scanner(System.in);
            userRounds = Integer.parseInt(userInput.nextLine());

            if ((userRounds > maxRounds) || (userRounds < minRounds)) {
                System.out.println("ERROR!! Can only input number between 1 and 10 ....end of program");
                System.exit(0);
            }
            else {
                // program will loop rock paper scissors for the amount of times user specified
                for (int i = 1; i <= userRounds; i++) {
                    System.out.println("=========================================");
                    System.out.print("Rock, Paper, Scissors? Choose 0 1 or 2 respectively ");
                    userChoice = Integer.parseInt(userInput.nextLine());
                    if (userChoice > 2 || userChoice < 0) {
                        System.out.println("ERROR!! Can only choose 0 1 or 2");

                    } else {
                        int pcRandom = random.nextInt(rps.length);
                        String compChoice = rps[pcRandom];

                        // it is a tie
                        if (pcRandom == userChoice) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("it's a tie");
                            ties++;
                            totalRounds++;
                        }
                        // rock beats scissors - PC
                        else if (compChoice.equals(rps[0]) && userChoice == 2) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("Computer won this round!");
                            pcWins++;
                            totalRounds++;
                        }

                        // rock beats scissors - user
                        else if (compChoice.equals(rps[2]) && userChoice == 0) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("You won this round!");
                            userWins++;
                            totalRounds++;
                        }

                        // paper beats rock - PC
                        else if (compChoice.equals(rps[1]) && userChoice == 0) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("Computer won this round!");
                            pcWins++;
                            totalRounds++;
                        }

                        // paper beats rock - user
                        else if (compChoice.equals(rps[0]) && userChoice == 1) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("You won this round!");
                            userWins++;
                            totalRounds++;
                        }

                        // scissors beat paper - PC
                        else if (compChoice.equals(rps[2]) && userChoice == 1) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("Computer won this round!");
                            pcWins++;
                            totalRounds++;
                        }

                        // scissors beat paper - user
                        else if (compChoice.equals(rps[1]) && userChoice == 2) {
                            System.out.println("Round " + i);
                            System.out.println("You chose: " + rps[userChoice]);
                            System.out.println("PC chose: " + compChoice);
                            System.out.println("You won this round!");
                            userWins++;
                            totalRounds++;
                        }
                    }
                }
                System.out.println("=========================================");
                System.out.println("Total rounds played: " + totalRounds);
                System.out.println("Total ties: " + ties);
                System.out.println("You won: " + userWins);
                System.out.println("Computer won: " + pcWins);
                if (userWins > pcWins) {
                    System.out.println("You won against the computer");
                } else if (pcWins > userWins) {
                    System.out.println("You lost, computer won against you");
                } else {
                    System.out.println("It's a tie");
                }
                System.out.println("******************************************");

                System.out.println("Do you want to play again? ");
                playAgain = userInput.nextLine();
                if (playAgain.equals("n")) {
                    play = false;
                    System.out.println("Thank you for playing!");
                    System.exit(0);
                } else if (playAgain.equals("y")){
                    play = true;
                }

            }
        }
    }
}