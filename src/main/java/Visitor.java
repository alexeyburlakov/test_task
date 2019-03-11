import java.util.List;

public class Visitor implements Observer {
    private static int id = 0;

    private int visitorId;
    private Male male;

    private List<Dance> visitorDanceList;

    public Visitor(Male male, List<Dance> danceList) {
        this.visitorId = id++;
        this.male = male;
        this.visitorDanceList = danceList;

        System.out.println("My number is " + this.visitorId + ", my male is " + this.male + ". " +
                "I dance " + danceList.toString());
    }

    public void update(Music music) {
        if (music.equals(Music.RNB) && (this.visitorDanceList.contains(Dance.RNB) || this.visitorDanceList.contains(Dance.HIP_HOP))) {
            System.out.println("Visitor with id  = " + this.visitorId + ": I'm dancing HipHop now");
        } else if (music.equals(Music.POP) && this.visitorDanceList.contains(Dance.POP)) {
            System.out.println("Visitor with id  = " + this.visitorId + ": I'm dancing Pop now");
        } else if (music.equals(Music.ELECTROHOUSE) && this.visitorDanceList.contains(Dance.ELECTRODANCE)) {
            System.out.println("Visitor with id  = " + this.visitorId + ": I'm dancing Electrohouse now");
        } else {
            System.out.println("Visitor with id  = " + this.visitorId + ": I'm drinking now");
        }
    }
}
