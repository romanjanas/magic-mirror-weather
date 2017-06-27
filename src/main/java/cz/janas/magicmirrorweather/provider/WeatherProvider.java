package cz.janas.magicmirrorweather.provider;

import cz.janas.magicmirrorweather.entity.WeatherData;

/**
 * Created by roman on 26/06/17.
 */
public interface WeatherProvider {

    WeatherData getWeatherData(String location);

}
