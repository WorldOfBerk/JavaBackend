package core;

import JLogger.JLoggerManager;

public class JLoggerManagerAdapter implements LoggerService {

    @Override
    public void logToSystem(String message) {
        JLoggerManager logger = new JLoggerManager();
        logger.log(message);
    }
}
