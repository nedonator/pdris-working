package app;

import org.springframework.http.ResponseEntity;

import java.util.List;

public interface Service {
        void save(List<String> data);
        List<Double> getLastDays(int days);
        double findMax(int days);
        double findMaxThroughDates(List<Double> dates);
        String goToService(int days);

}
