package DesignPatterns.Creational.Singleton.threadSafe;

public class Main {


    public static void main(String[] args) {
        
        // // obj1 
        // Logger logger = Logger.createObject();
        // logger.log("obj1");


        //  // obj2 
        //  Logger logger1 = Logger.createObject();
        //  logger1.log("obj2");


         Thread thread1 = new Thread(
            new Runnable() {
              public void run() {
                System.out.println("running thread1");
               Logger.createObject();
              };
            }
            );
   
            Thread thread2 = new Thread (
               new Runnable() {
                 public void run() {
                    System.out.println("running thread2");
                  Logger.createObject();
                 };
               }
               );
   
   
               thread1.start();
               thread2.start();
   
         

    }
    
}
