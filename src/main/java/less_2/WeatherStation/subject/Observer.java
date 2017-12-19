package less_2.WeatherStation.subject;

/**
 * @author shufd
 * @version 1.0
 * @date 2017-12-19 23:59
 */
public interface Observer {
    void update(float temp, float humidity, float pressure);
}
