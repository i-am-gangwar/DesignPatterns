package behavioral.observerPattern.withOut;


import java.util.Scanner;

// (Concrete Class)
public class WeatherStation implements Weather {

    private String temperature = null;

    // hardcoded displays (tight coupling!)
    private PhoneDisplay phoneDisplay = new PhoneDisplay();
    private WebDisplay webDisplay = new WebDisplay();
    private TVDisplay tvDisplay = new TVDisplay();



    @Override
    public void setTemperature(String temp) {
        this.temperature = temp;
        // manually update each display
        phoneDisplay.showTemperature(temp);
        webDisplay.showTemperature(temp);
        tvDisplay.showTemperature(temp);

    }

    @Override
    public String getTemperature() {
        return temperature;
    }
}

