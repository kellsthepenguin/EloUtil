package me.jwkim.eloutil;

public class EloUtil {
    public static double getEstimatedWinRate(double me, double op) {
        return Math.round((1 / (Math.pow(10, (op - me) / 400) + 1)) * 100.0) / 100.0;
    }
}
