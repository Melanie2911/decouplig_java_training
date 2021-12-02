package fr.lernejo.logger;

public class LoggerFactory {
    public static Logger getLogger(String name) {
       Logger loger = new CompositeLogger(
           new ContextualLogger(new FileLogger("file1Log"),name),
           new ContextualLogger(new ConsoleLogger(),name));
       return loger;
    }
}
