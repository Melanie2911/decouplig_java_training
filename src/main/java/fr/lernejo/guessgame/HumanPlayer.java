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
            this.logger.log("plus grand");
        } else {
            this.logger.log("plus petit");
        }
    }
}
