package DesignPatterns.behavioral.chainOfResponsibility;

import DesignPatterns.behavioral.chainOfResponsibility.logProcessor.LogProcessor;

public class InfoLogProcessor extends LogProcessor {

   InfoLogProcessor(LogProcessor nextLogProcessor){
       super(nextLogProcessor);
   }
   public void log(int logLevel, String message){
       if(logLevel==INFO){
           System.out.println("INFO log: "+ message);
       }
       else
           super.log(logLevel,message);
   }

}
