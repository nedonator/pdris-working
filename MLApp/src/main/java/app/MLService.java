package app;

import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

public class MLService {
    public Double getPrediction(){
        RestTemplate restTemplate = new RestTemplate();

        String dollars = "http://rbc:8060/dollarsMax";
        String weather = "http://weather:8070/getWeather";

        ResponseEntity<String> dol = restTemplate.getForEntity(dollars, String.class);
        ResponseEntity<String> wet = restTemplate.getForEntity(weather, String.class);
        System.out.println(dol.getBody());


        Double ans = Double.parseDouble(dol.getBody()) * ( Double.parseDouble(wet.getBody()) - 0.1) / Double.parseDouble(wet.getBody());

        return ans;
    }
}
