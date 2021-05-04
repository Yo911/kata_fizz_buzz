package com.kata.tennis;

import java.util.HashMap;
import java.util.Map;

public class Score {

    private static final Map<Integer, String> points = new HashMap<>();

    static {
        points.put(0, "0");
        points.put(1, "Love");
        points.put(2, "Fifteen");
        points.put(3, "Thirty");
        points.put(4, "Forty");
    }

    public static String getScore(int point) {
        return points.get(point);
    }
}
