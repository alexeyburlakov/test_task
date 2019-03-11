import java.util.Scanner;

public class Main {
    public static void main(String... args) {
        Club club = new Club();
        int countOfVisitors = Utils.getRandomValue(100);
        System.out.println("Count of visitors = " + countOfVisitors);
        for (int i = 0; i < countOfVisitors; i++) {
            club.registerObserver(new Visitor(Male.values()[Utils.getRandomValue(1)], Dance.getRandomDanceList()));
        }

        System.out.println("\nEnter any symbol to run disco, enter 'exit' to exit");

        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine();

        Thread clubThread = new Thread(club);
        if ("exit".equals(userInput)) {
            System.exit(0);
        } else {
            clubThread.start();
        }

        while (!"exit".equals(userInput)) {
            userInput = scanner.nextLine();
        }

        clubThread.interrupt();
        System.exit(0);
    }
}
