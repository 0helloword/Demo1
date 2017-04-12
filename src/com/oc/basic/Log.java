package com.oc.basic;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;


public class Log {
    
    private static Logger Log = Logger.getLogger(Log.class.getName());
    
    public static void startTestCase(String sTestCaseName){
        PropertyConfigurator.configure("log4j.properties");
        Log.info("****************************************************************************************");    
        Log.info("$$$$$$$$$$$$$$$$$$$$$                 "+sTestCaseName+ "       $$$$$$$$$$$$$$$$$$$$$$$$$");   
        Log.info("****************************************************************************************");
    
        }
    
    public static void endTestCase(String sTestCaseName){
        PropertyConfigurator.configure("log4j.properties");
        Log.info("XXXXXXXXXXXXXXXXXXXXXXX             "+"-E---N---D-"+"             XXXXXXXXXXXXXXXXXXXXXX");
        }

    public static void info(String message) {
            PropertyConfigurator.configure("log4j.properties");
            Log.info(message);
    }
}  