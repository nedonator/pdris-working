package app.JsonParsing;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import java.util.ArrayList;

@JsonIgnoreProperties(ignoreUnknown = true)
public class TempOneDay {
    public ArrayList<TempOneDayData> getData() {
        return data;
    }

    public void setData(ArrayList<TempOneDayData> data) {
        this.data = data;
    }

    private ArrayList<TempOneDayData> data;
}
