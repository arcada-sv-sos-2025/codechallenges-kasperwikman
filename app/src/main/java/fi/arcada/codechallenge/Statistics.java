package fi.arcada.codechallenge;
import java.util.ArrayList;

public class Statistics {
    public static double calcMean(ArrayList<Double> data) {
        if (data == null || data.isEmpty()) {
            return 0.0;
        }
        double sum = 0;
        for (Double value : data) {
            sum += value;
        }
        return sum / data.size();
    }
}