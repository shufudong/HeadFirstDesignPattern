package less_2.WeatherStationForJavaUtil.observer;

import less_2.WeatherStationForJavaUtil.display.DisplayElement;
import less_2.WeatherStationForJavaUtil.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-20 0:39
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    private Observable observale;
    private float temperature;
    private float humidity;

    public CurrentConditionsDisplay(Observable observale) {
        this.observale = observale;
        observale.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            this.temperature = weatherData.getTemperature();
            this.humidity = weatherData.getHumidity();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("Current conditions:" + temperature + "F degrees and " + humidity + "% humidity.");
    }
}
