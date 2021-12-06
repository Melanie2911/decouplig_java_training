package fr.lernejo.guessgame;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import fr.lernejo.guessgame.Player;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

import java.util.Date;
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
        long nombre = player.askNextGuess();
        if ( numberToGuess == nombre ){
            //this.logger.log("True");
            return true;
        }
        else{
            if( numberToGuess < nombre){
                this.logger.log("le nombre est plus petit que celui à trouver");
                //this.player.respond(true);
            }
            else{
                this.logger.log("le nombre est plus grand que celui à trouver");
                //this.player.respond(false);
            }
            //this.logger.log("False");
            return false;
        }

    }

    public void loopUntilPlayerSucceed(Long nb) {
        //TODO implement me
        int max = 0;
        long debtime = System.currentTimeMillis();
        while(nextRound()!=true && max < nb){
            nextRound();
            max=max+1;
        }
        long endtime = System.currentTimeMillis();
        long time = endtime - debtime;
        Date currentDate = new Date(time);
        DateFormat df = new SimpleDateFormat("mm:ss.SSS");
        if (max < nb){
            this.logger.log("le joueur a trouvé la solution avant la limite d’itération, win");
            this.logger.log("Temps pris pour l'éxécution: " + df.format(currentDate));
        }
        else{
            this.logger.log("le joueur n'a pas trouvé la solution avant la limite d’itération, perdu");
            this.logger.log("Temps pris pour l'éxécution: " + df.format(currentDate));
        }
    }
}
