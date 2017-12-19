package less_2.WeatherStation.observer;

import less_2.WeatherStation.subject.Observer;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 23:59
 */
public interface Subject {
    void registerObserver(Observer o);

    void removeObserver(Observer o);

    void notifyObservers();
}
