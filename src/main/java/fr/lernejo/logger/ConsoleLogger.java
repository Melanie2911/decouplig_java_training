package fr.lernejo.logger;

public class ConsoleLogger implements Logger {
    @Override
    public void log(String message) {
        System.out.println(message);
    }

    // contenu de la classe (attributs, méthodes)
}
