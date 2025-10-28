package creational.abstractFactory.factory;

public class FactoryProducer {


    public static NotificationFactory getFactory(String type){
    
        if(type.equalsIgnoreCase("Android")){
            return new AndroidNotificationFactory();
        }
        else if(type.equalsIgnoreCase("iOS")){
            return new iOSNotificationFactory();
        }
        else{
            return null;
        }

    }
    
}
