package edu.temple.jsonexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

public class MainActivity extends AppCompatActivity {

    TextView companyName, stockPrice;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        companyName = findViewById(R.id.companyName);
        stockPrice = findViewById(R.id.stockPrice);

        String jsonData = "{\"Status\":\"SUCCESS\",\"Name\":\"Alphabet Inc\",\"Symbol\":\"GOOGL\",\"LastPrice\":1055.94,\"Change\":25.8400000000001,\"ChangePercent\":2.50849432093973,\"Timestamp\":\"Mon Nov 26 00:00:00 UTC-05:00 2018\",\"MSDate\":43430,\"MarketCap\":365197904940,\"Volume\":1577941,\"ChangeYTD\":1053.4,\"ChangePercentYTD\":0.241123979494965,\"High\":1057,\"Low\":1039.77,\"Open\":1044}";
        //I want to convert this data to a JSON Object

        try {
            JSONObject stockObject = new JSONObject(jsonData);

            // you need to know the schema / what your keys are
            companyName.setText(stockObject.getString("Name"));
            stockPrice.setText(String.valueOf(stockObject.getDouble("LastPrice")));
        } catch (JSONException e) {
            e.printStackTrace();
        }

        /*
        JSONArray jsonArray;

        jsonArray.getDouble(); */
    }
}
