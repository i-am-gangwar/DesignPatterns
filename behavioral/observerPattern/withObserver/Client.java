package behavioral.observerPattern.withObserver;

// 5. Client
public class Client {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();

        Observer phone = new PhoneDisplay();
        Observer web = new WebDisplay();
        Observer tv = new TVDisplay();

        // register displays
        station.addObserver(phone);
        station.addObserver(web);
        station.addObserver(tv);

        // change temperature -> all displays auto update
        station.setTemperature(30);
        station.setTemperature(35);

        // remove one display
        station.removeObserver(tv);

        // update again
        station.setTemperature(40);
    }
}