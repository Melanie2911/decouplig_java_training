package fr.lernejo.guessgame;
import java.security.SecureRandom;
import java.util.Scanner;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class ComputerPlayer implements  Player {
    Logger logger = LoggerFactory.getLogger("player");
    long number;
    int max = 100;
    int min = 0;

    @Override
    public long askNextGuess() {
        SecureRandom random = new SecureRandom();
        number = random.nextInt(min,max);
        return number;
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if ( lowerOrGreater ) {
            System.out.println("Le nombre est plus petit que celui à trouver");
            max = (int) number;
        } else {
            System.out.println("Le nombre est plus grand que celui à trouver");
            min = (int) number;
        }
    }
}
