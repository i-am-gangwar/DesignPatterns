package behavioral.chainOfResponsibility;

import behavioral.chainOfResponsibility.logProcessor.DebugLogProcessor;
import behavioral.chainOfResponsibility.logProcessor.ErrorLogProcessor;
import behavioral.chainOfResponsibility.logProcessor.LogProcessor;

public class Main {

    public static void main(String[] args){
        System.out.println("chain of responsibility pattern");
        // making chain-
        LogProcessor logProcessorObj = new InfoLogProcessor(new DebugLogProcessor( new ErrorLogProcessor(null)));
        logProcessorObj.log(LogProcessor.INFO, "Printing info log");
        logProcessorObj.log(LogProcessor.DEBUG, "Printing debug log");
        logProcessorObj.log(LogProcessor.ERROR, "Printing error log");
    }
}
