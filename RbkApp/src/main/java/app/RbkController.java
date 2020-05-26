package app;

import org.json.JSONException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;


@RestController
public class RbkController {

    @Autowired
    private FinalRbkService finalRbkService;

    @RequestMapping(value = {"/", "/dollarsMax"})
    public Double getMaxDollar() {
        //SimpleGet ans = new SimpleGet();
        //ans.setResult(finalRbkService.getMaxCurrency());
        Double ans = finalRbkService.getMaxCurrency();
        return ans;
    }

}
