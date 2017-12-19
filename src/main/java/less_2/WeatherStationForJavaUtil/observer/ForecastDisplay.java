package less_2.WeatherStationForJavaUtil.observer;

import less_2.WeatherStationForJavaUtil.display.DisplayElement;
import less_2.WeatherStationForJavaUtil.subject.WeatherData;

import java.util.Observable;
import java.util.Observer;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-20 0:44
 */
public class ForecastDisplay implements Observer, DisplayElement {

    private Observable observable;
    private float currentPressure = 29.92f;
    private float lastPressure;

    public ForecastDisplay(Observable observable) {
        this.observable = observable;
        observable.addObserver(this);
    }

    @Override
    public void update(Observable o, Object arg) {
        if (o instanceof WeatherData) {
            WeatherData weatherData = (WeatherData) o;
            lastPressure = currentPressure;
            currentPressure = weatherData.getPressure();
            display();
        }
    }

    @Override
    public void display() {
        System.out.println("current pressure:" + this.currentPressure + ",and last pressure:" + this.lastPressure);
    }
}
