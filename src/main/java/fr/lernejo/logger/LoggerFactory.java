package fr.lernejo.logger;
import java.util.function.Predicate;
public class LoggerFactory {
    public static Logger getLogger(String name) {
        Predicate<String> condition = message -> message.contains("simulation");
        Logger loger = new CompositeLogger(new ContextualLogger(new ConsoleLogger(), name),
                      new ContextualLogger(new FilteredLogger(new FileLogger("logs.txt"),condition), name));

       return loger;
    }
}

