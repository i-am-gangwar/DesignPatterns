package creational.singleton.notThreadSafe;

public class Main {


    public static void main(String[] args) {
        
        // // obj1 
        // Logger logger = Logger.createObject();
        // logger.log("obj1");


        //  // obj2 
        //  Logger logger1 = Logger.createObject();
        //  logger1.log("obj2");



         // problem will occur when 2 multiThreading will call createObject method at the same time
         // solution make createObject mehtod synchronized  or use double check by synchronized block.
         // run below code.

         Thread thread1 = new Thread(
         new Runnable() {
           public void run() {
            Logger.createObject();
           };
         }
         );

         Thread thread2 = new Thread (
            new Runnable() {
              public void run() {
               Logger.createObject();
              };
            }
            );


            thread1.start();
            thread2.start();

            
           

    }
    
}
