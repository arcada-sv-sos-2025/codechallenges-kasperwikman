package fi.arcada.codechallenge;
import java.util.ArrayList;

public class Statistics {
    public static double calcMean(ArrayList<Double> data) {
        double sum = 0;
        for (Double value : data) {
            sum += value;
        }
        return sum / data.size();
    }
}