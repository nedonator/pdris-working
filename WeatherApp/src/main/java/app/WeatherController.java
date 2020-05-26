package app;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.ArrayList;

@RestController
public class WeatherController {
    @RestController
    public class MaxRestController {

        @Autowired
        private WeatherService weatherService;


        @GetMapping(value = {"/", "/getWeather"})
        public Double getTodayWeather() throws JSONException, IOException {
            return weatherService.getTemperatureForLastDays(1).get(0);
        }
    }
}
