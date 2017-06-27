package cz.janas.magicmirrorweather;

import cz.janas.magicmirrorweather.entity.WeatherData;
import cz.janas.magicmirrorweather.provider.WeatherProvider;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by roman on 26/06/17.
 */
@RestController
public class WeatherController {

    @Autowired
    private WeatherProvider weatherProvider;

    @RequestMapping("/weather/{location}")
    public WeatherData getWeather(@PathVariable(value="location") String location) {
        return weatherProvider.getWeatherData(location);
    }

}
