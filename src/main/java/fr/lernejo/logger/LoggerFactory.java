package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
       Logger loger = new ConsoleLogger();
       return loger;
    }
}
