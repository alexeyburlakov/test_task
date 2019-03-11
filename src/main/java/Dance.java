import java.util.ArrayList;
import java.util.List;

public enum Dance {
    HIP_HOP,
    RNB,
    ELECTRODANCE,
    POP;

    public static List<Dance> getRandomDanceList() {
        List<Dance> danceList = new ArrayList();
        int countOfDance = Dance.values().length;
        for (int i = 0; i < countOfDance; i++) {
            if (Utils.getRandomValue(1) == 1) {
                danceList.add(Dance.values()[i]);
            }
        }
        return danceList;
    }
}
