package less_2.WeatherStation.subject.impl;

import less_2.WeatherStation.display.DisplayElement;
import less_2.WeatherStation.observer.Subject;
import less_2.WeatherStation.subject.Observer;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-20 0:18
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private float temperature;

    private float humidity;

    private Subject weatherData;

    public CurrentConditionsDisplay(Subject weatherData) {
        this.weatherData = weatherData;
        weatherData.registerObserver(this);
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity.");
    }

    @Override
    public void update(float temp, float humidity, float pressure) {
        this.temperature = temp;
        this.humidity = humidity;
        display();
    }

}
