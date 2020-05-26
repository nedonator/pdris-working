package app;

import org.springframework.boot.SpringApplication;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class MyService implements Service {

    public MyService() {

    }

    @Override
    public void save(List<String> data) {

    }

    @Override
    public String goToService(int days) {
        RestTemplate restTemplate = new RestTemplate();
        String fooResourceUrl = "http://export.rbc.ru/free/selt.0/free.fcgi?period=DAILY&tickers=USD000000TOD&separator=TAB&data_format=BROWSER&lastdays=" + days;
        ResponseEntity<String> response = restTemplate.getForEntity(fooResourceUrl + "/1", String.class);
        String info = response.getBody();

        return info;
    }

    @Override
    public List<Double> getLastDays(int days) {
        List<Double> nDays = new ArrayList<>();
        try{
        String responseInfo = goToService(days);

        String[] lines = responseInfo.split("\\r?\\n");

        for (int i = 0; i < lines.length; i++) {
            String[] splits = lines[i].split("\\s+");
            String curValue = splits[splits.length - 1];
            nDays.add(Double.parseDouble(curValue));
        }
        }catch(Exception e){
        for(int i = 0; i < days; i++)
        nDays.add(new java.util.Random().nextDouble() * 10 + 60);
        }

        return nDays;
    }


    @Override
    public double findMax(int days) {
        List<Double> nDays = getLastDays(days);

        double maxDollarValue = 0;

        for (int i = 0; i < nDays.size(); i++) {
            if (nDays.get(i) > maxDollarValue) {
                maxDollarValue = nDays.get(i);
            }
        }
        return maxDollarValue;
    }

    @Override
    public double findMaxThroughDates(List<Double> dates) {
        double maxDollarValue = 0;

        for (int i = 0; i < dates.size(); i++) {
            if (dates.get(i) > maxDollarValue) {
                maxDollarValue = dates.get(i);
            }
        }
        return maxDollarValue;
    }
}
