package fi.arcada.codechallenge;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {

    TextView myView;

    Button myButton;

    ArrayList<Double> myNumbers;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        myNumbers = new ArrayList<>(Arrays.asList(1.0, 2.0, 3.0, 9.0, 5.0));

        // deklarera TextView och initialisera med findViewById
        myView = findViewById(R.id.myView);
        myButton = findViewById(R.id.myButton);

        myView.setText("Check out this text!");
        myButton.setText("Click me!");

        myButton.setOnClickListener(v -> calculate());

    }
    private void calculate() {
        double mean = Statistics.calcMean(myNumbers);
        myView.setText("The mean is: " + mean);
    }
}