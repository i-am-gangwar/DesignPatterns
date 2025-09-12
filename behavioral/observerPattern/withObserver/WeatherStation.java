package behavioral.observerPattern.withObserver;


import java.util.ArrayList;
import java.util.List;

// 3. Concrete Subject (WeatherStation)
class WeatherStation implements Subject {
    private int temperature;
    private List<Observer> observers = new ArrayList<>();

    public void setTemperature(int temp) {
        this.temperature = temp;
        System.out.println("\nWeatherStation: Temperature set to " + temp);
        notifyObservers();
    }

    public int getTemperature() {
        return temperature;
    }

    @Override
    public void addObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer o : observers) {
            o.update(temperature);
        }
    }
}