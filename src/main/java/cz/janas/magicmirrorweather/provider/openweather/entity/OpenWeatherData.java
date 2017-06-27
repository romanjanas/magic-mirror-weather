package cz.janas.magicmirrorweather.provider.openweather.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;

/**
 * Created by roman on 27/06/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class OpenWeatherData {
    private Main main;
    private List<Weather> weather;

    public OpenWeatherData() {
    }

    public Main getMain() {
        return main;
    }

    public void setMain(Main main) {
        this.main = main;
    }

    public List<Weather> getWeather() {
        return weather;
    }

    public void setWeather(List<Weather> weather) {
        this.weather = weather;
    }

    @Override
    public String toString() {
        return "OpenWeatherData{" +
                ", main=" + main +
                ", weather=" + weather +
                '}';
    }
}
