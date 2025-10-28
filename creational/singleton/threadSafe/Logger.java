package creational.singleton.threadSafe;

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

        // double check tech
        if(loggerInstance==null){
            synchronized (Logger.class) {
                if(loggerInstance==null){
                    loggerInstance = new Logger();
                    System.out.println("New Object created");
                }
            }
            
        }
        return loggerInstance;
    } 
    
}
