package DesignPatterns.behavioral.chainOfResponsibility.logProcessor;

public  abstract class LogProcessor {
    public static final int INFO = 1;
    public static final int DEBUG = 2;
    public static final int ERROR = 3;

    LogProcessor nextLogProcessor;

    public LogProcessor(LogProcessor logProcessor){
        System.out.println(logProcessor + " constructor");
        this.nextLogProcessor = logProcessor;
    }
   public void log(int level, String message){
        if(nextLogProcessor!=null){
            nextLogProcessor.log(level,message);
        }
   }
}
