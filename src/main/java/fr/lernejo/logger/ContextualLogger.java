package fr.lernejo.logger;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class ContextualLogger implements Logger {
    private Logger delegateLogger;
    private DateTimeFormatter formatter;
    private String callerClass;

    public ContextualLogger(String callerClass, Logger delegateLogger) {
        this.delegateLogger = delegateLogger;
        this.formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss.SSS");
        this.callerClass = callerClass;
    }

    @Override
    public void log(String message) {
        delegateLogger.log(LocalDateTime.now().format(formatter) + " " + callerClass + " " + message);
    }

}
