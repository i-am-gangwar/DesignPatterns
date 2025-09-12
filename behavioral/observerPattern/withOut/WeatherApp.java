package behavioral.observerPattern.withOut;

import java.util.Scanner;

public class WeatherApp {

    public static void main(String[] args) {

        WeatherStation station = new WeatherStation();
            Scanner sc = new Scanner(System.in);
            System.out.println("What temp you want to set enter the value: ");
            String temp = sc.nextLine();
        station.setTemperature(temp);
        sc.close();;
    }
}
