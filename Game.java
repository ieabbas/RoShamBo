package roShamBo;
//import java.io.*;
import java.util.*;
/*
  This program represents a simple game of "Rock, Paper, Scissors". The goal of the computer
  is to learn from the player's previous moves to determine what the next move will be, and 
  counter it. To do this, the computer will utilize one of many algorithms available to it.
  The player has 10 matches to win the series.
 
  Programmer -> ieabbas
 */

//1 = rock, 2 = paper, 3 = scissors
public class Game {
    public static void main (String[]args) {
        int numOfMatches;
        // Set the default strategy for the computer (more algorithms to come later)
        String strategy = "frequency";
        Scanner kb = new Scanner(System.in);
        System.out.println("How many matches would you like to play? :D");
        numOfMatches = kb.nextInt();
        // Make sure the number of matches is more than 10 so the computer has a chance to "learn"
        while(numOfMatches <= 10) {
            System.out.println("Sorry! You need to input a number of 10 or higher!");
            numOfMatches = kb.nextInt();
        }
        System.out.println("Awesome! " + numOfMatches + " it is then!");
        playOn(numOfMatches);
    }
    
    /*
    This method wil essentially be the game logic that will be used to beat the player. It should be 
    noted that a switch/case style of code will be used for logic, with chars representing what each case
    will be ('r' for rock chosen by player, 'p' for paper chosen by player, etc)
    */
    public static void playOn(int howManyMatches) {
        int gamesPlayed = 0;
        // While the number of games is less than the amount of games specified, play on
        while(gamesPlayed != howManyMatches) {
            
        
        }
        // Leave the game once all is concluded
        System.exit(0);
    }
}
