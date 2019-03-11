import java.util.Random;

public class Utils {
    public static int getRandomValue(int bound) {
        return new Random().nextInt(bound + 1);
    }
}
