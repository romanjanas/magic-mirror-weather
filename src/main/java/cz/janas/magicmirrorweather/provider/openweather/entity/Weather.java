package cz.janas.magicmirrorweather.provider.openweather.entity;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

/**
 * Created by roman on 27/06/17.
 */
@JsonIgnoreProperties(ignoreUnknown = true)
public class Weather {
    private String description;
    private String icon;
    private int id;

    public Weather() {
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIcon() {
        return icon;
    }

    public void setIcon(String icon) {
        this.icon = icon;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Weather{" +
                "description='" + description + '\'' +
                ", icon='" + icon + '\'' +
                ", id=" + id +
                '}';
    }
}
