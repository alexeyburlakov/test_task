import java.util.ArrayList;
import java.util.List;

public class Club implements Observable, Runnable {
    private List<Observer> observers = new ArrayList<>();
    private Music currentMusic;

    @Override
    public void registerObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers)
            observer.update(this.currentMusic);
    }

    public void changeMusic(Music music) {
        this.currentMusic = music;
        notifyObservers();
    }

    @Override
    public void run() {
        while (true) {
            currentMusic = Music.values()[Utils.getRandomValue(2)];
            System.out.println("\n\n\nNow playing " + currentMusic);
            changeMusic(currentMusic);
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
