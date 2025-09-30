package Creational.Singleton.notThreadSafe;

public class Logger {

    int logCount;

    private static Logger loggerInstance = null;

    public void log(String message){
        System.out.println(message);
    }

    private Logger(){
       this.logCount = 0;
    };

    public static Logger createObject(){

        if(loggerInstance==null){
            loggerInstance = new Logger();
            System.out.println("New Object created");
        }
        return loggerInstance;
    } 
    
}
