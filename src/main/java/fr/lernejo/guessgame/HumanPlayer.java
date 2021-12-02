package fr.lernejo.guessgame;
import java.util.Scanner;
import fr.lernejo.logger.Logger;
import fr.lernejo.logger.LoggerFactory;

public class HumanPlayer implements  Player {
    Logger logger = LoggerFactory.getLogger("player");
    Scanner scanner = new Scanner(System.in);

    @Override
    public long askNextGuess() {
        return scanner.nextInt();
    }

    @Override
    public void respond(boolean lowerOrGreater) {
        if (lowerOrGreater) {
            System.out.println("Le nombre est plus grand");
        } else {
            System.out.println("Le nombre est plus petite");
        }
    }
}
