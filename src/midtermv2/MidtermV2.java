/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package midtermv2;

/**
 *
 * @author Owen Tolton
 * CS173 Midterm
 * 
 * This program quizzes the user to determine what __ they are using a combination 
 * of multiple choice, true/false, and short answer questions.
 * <p>
 * Inputs are handed from the Main to their respective method depending on the 
 * question type for input handling and scoring. The question methods take the 
 * user's input and an integer used to assign a unique score to each potential 
 * answer.
 * <p>
 * The totaled scores are then classified into the possible results of the quiz 
 * at the end. The test taker then has the option to quit or take the test 
 * again.
 * 
 */


// imports Scanner
import java.util.Scanner;


public class MidtermV2 {
  
    /**
     * @param input the user's input from the question asked in the Main
     * @param scoring takes a 2 digit integer that is unique to each question 
     * and takes the first digit as the 'true' score and the second as the 'false'
     * score to assign a score to the input
     * @return returns score value
     */
    public static int trueFalseQuestion(String input, int scoring){
        int result = 0;
        int trueScore = scoring/10;
        int falseScore = scoring%10;
        System.out.println(trueScore);
        System.out.println(falseScore);
        boolean isTrue = Boolean.valueOf(input);
        if(isTrue)
        {
            result = trueScore;
        }
        else
        {
            result = falseScore;
        }
        return result;
    }
    
    
    /**
     * 
     * @param input
     * @param scoring
     * @return 
     */
    public static int multipleChoiceQuestion(String input, int scoring){
        int result = 0;
        
        
        return result;
    }
    
        
    /**
     * 
     * @param input user's input
     * @param scoring the actual answer
     * @param scoringCoefficient scales outputted score to a value from 1 to n
     * for easier score keeping
     * @return returns score value
     */
    public static int numericalResponseQuestion(String input, int realAnswer, double scoringCoefficient){
        return 0;
    }
    
    
    
    /**
     * @param args the command line arguments
     */
        
    public static void main(String[] args) {
        // Setup Scanner
        Scanner in = new Scanner(System.in);
        
        // setup sentinel value for retry/quit
        boolean done = false;
                
        /* main loop: Asks questions and hands input to proper methods while
        *  done is equal to false. done is set to true if user decides to quit
        *  at the end of the quiz.
        */
        do{
            //reset score
            int score = 0;
            
            // Introduction
            System.out.println("Welcome to the quest for the Holy Grail.");
            System.out.println("For multiple choice questions, type the letter "
                    + "that corresponds to your choice.\n");
            System.out.println("Look, there's that old man from Scene 24! What's he doing here?");
            System.out.println("He's the keeper of the Bridge of Death. Answer wrong, and you're cast into the Gorge of Eternal Peril.");
            System.out.println("Bridgekeeper: \"STOP. Who would cross the Bridge"
                    + " of Death must answer me these questions three: \"");
            
                    
            // Question 1
            System.out.println("\n1. How do you react?");
            System.out.println("a. Respond: \"Ask me the questions Bridgekeeper, I'm not afraid.\"");
            System.out.println("b. Respond: \"Ask me the questions, Bridgekeeper.\"");
            System.out.println("c. ");
            System.out.println("d. Bravely run away.");
            String input = in.nextLine();
            score = multipleChoiceQuestion(input, 3214);
            
            // Question 2
            System.out.println("\nWhat is your name?");
            System.out.println("a. Arthur, King of the Britons");
            System.out.println("b. Sir Lancelot of Camelot");
            System.out.println("c. Sir Galahad of Camelot");
            System.out.println("d. I want to enter my own name.");
            
            
            // Question 3
            System.out.println("What is the airspeed velocity of an unladen swallow?");
            System.out.println("a. An African or European swallow?");
            System.out.println("b. I don't know.");
            
            
            
            // Question 4
            
            
            // Question 5
            
            
            // Question 6
            
            
            // Question 7
            
            
            // Question 8
            
            
            // Question 9
            
            
            // Question 10
            
            
            // Asks to play again or quit.
            System.out.println("Would you like to play again? Press Y/N");
            // temp ending
            done = true;
        }while(!done);
        
    }
    
}
