package cz.janas.magicmirrorweather.provider.openweather;

import cz.janas.magicmirrorweather.entity.Result;
import cz.janas.magicmirrorweather.entity.WeatherData;
import cz.janas.magicmirrorweather.provider.WeatherProvider;
import cz.janas.magicmirrorweather.provider.openweather.entity.OpenWeatherData;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 * Created by roman on 26/06/17.
 */
@Component
public class OpenWeatherProvider implements WeatherProvider {

    @Value("country.code:CZ")
    private String countryCode;

    @Value("${openweathermap.baseUrl:http://api.openweathermap.org/data/2.5/weather?q=}")
    private String baseUrl;

    @Value("${openweathermap.appid:52de602fa5b235d5035ce8d40a7603d5}")
    private String appId;

    @Value("${openweathermap.units:metric}")
    private String units;

    private static RestTemplate restTemplate = new RestTemplate();

    @Override
    public WeatherData getWeatherData(String location) {
        WeatherData weatherData = new WeatherData();
        String finalUrl = baseUrl + location + "&units=" + units + "&appid=" + appId;
        ResponseEntity<OpenWeatherData> openWeatherResponse = restTemplate.getForEntity(finalUrl, OpenWeatherData.class);
        if (openWeatherResponse.getStatusCode() == HttpStatus.OK) {
            OpenWeatherData openWeatherData = openWeatherResponse.getBody();
            if (openWeatherData != null) {
                weatherData.setTemperature(openWeatherData.getMain().getTemp());
                if (openWeatherData.getWeather() != null && openWeatherData.getWeather().size() > 0) {
                    weatherData.setConditions(openWeatherData.getWeather().get(0).getDescription());
                    weatherData.setIconId(String.valueOf(openWeatherData.getWeather().get(0).getId()));
                    weatherData.setResult(new Result(0));
                } else {
                    weatherData.setResult(new Result(0, "temperature only"));
                }

            }
        }

        return weatherData;
    }
}
