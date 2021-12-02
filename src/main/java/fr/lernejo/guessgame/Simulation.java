package fr.lernejo.guessgame;

import fr.lernejo.guessgame.Player;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Scanner;

public class Simulation {

    private final Logger logger = LoggerFactory.getLogger("simulation");
    private final Player player;  //TODO add variable type
    private long numberToGuess; //TODO add variable type

    public Simulation(Player player) {
        //TODO implement me
        this.player=player;

    }

    public void initialize(long numberToGuess) {
        //TODO implement me
        this.numberToGuess=numberToGuess;
    }

    /**
     * @return true if the player have guessed the right number
     */
    private boolean nextRound() {
        //TODO implement me
        Scanner scanner = new Scanner(System.in);
        int nombre = scanner.nextInt();
        if ( numberToGuess == nombre ){
            this.logger.log("True");
            return true;
        }
        else{
            if( numberToGuess < nombre){
                this.logger.log("le nombre est plus petit");
            }
            else{
                this.logger.log("le nombre est plus grand");
            }
            this.logger.log("False");
            return false;
        }

    }

    public void loopUntilPlayerSucceed() {
        //TODO implement me
        do {
            nextRound();
        } while(nextRound()!=true) ;
    }
}
