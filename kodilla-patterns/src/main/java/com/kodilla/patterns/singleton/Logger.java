package com.kodilla.patterns.singleton;

public class Logger {
    private static Logger loggerInstance = null;
    private String lastLog = "";

    private Logger() {
    }

    public static Logger getInstance() {
        if(loggerInstance == null) {
            loggerInstance = new Logger();
        }
        return loggerInstance;
    }
    public String log(String log) {
        lastLog = log;
        System.out.println("Log: [" + log + "]");
        return log;
    }

    public String getLastLog() {
        return lastLog;
    }
}