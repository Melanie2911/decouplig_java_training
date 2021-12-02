package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
       Logger loger = new ContextualLogger(new FileLogger("fileLog"),name);
       return loger;
    }
}
