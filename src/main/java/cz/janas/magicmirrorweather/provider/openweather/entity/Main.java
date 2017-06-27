package cz.janas.magicmirrorweather.provider.openweather.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by roman on 27/06/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Main {
    private Double temp;

    public Main() {
    }

    public Double getTemp() {
        return temp;
    }

    public void setTemp(Double temp) {
        this.temp = temp;
    }

    @Override
    public String toString() {
        return "Main{" +
                "temp=" + temp +
                '}';
    }
}
