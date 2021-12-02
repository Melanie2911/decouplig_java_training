package fr.lernejo.logger;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class CompositeLogger implements Logger {

        private Logger delegateLogger;
        private Logger delegateLogger2;

        public CompositeLogger(Logger delegateLogger, Logger delegateLogger2) {
            this.delegateLogger = delegateLogger;
            this.delegateLogger2 = delegateLogger2;

        }

        @Override
        public void log(String message) {
            delegateLogger.log(message);
            delegateLogger2.log(message);
        }

}

