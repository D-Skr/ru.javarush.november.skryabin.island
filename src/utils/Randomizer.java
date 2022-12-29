package utils;

import java.util.concurrent.ThreadLocalRandom;

public class Randomizer {

    public static int getRandom(int from, int to) {
        return ThreadLocalRandom.current().nextInt(from, to);
    }

    public static double getRandom(double from, double to){
        return ThreadLocalRandom.current().nextDouble(from, to);
    }

}
