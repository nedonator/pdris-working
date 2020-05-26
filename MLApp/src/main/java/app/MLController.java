package app;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MLController {
    private MLService mlService = new MLService();

    @RequestMapping(value = {"/", "/predict"})
    public Double getMaxDollar() {
        Double ans = mlService.getPrediction();
        //Double ans = 68.09;
        return ans;
    }
}
