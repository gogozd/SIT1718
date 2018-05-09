import java.time.LocalDate;
import java.util.ArrayList;

public abstract class Device implements Maintenance {

    ArrayList<LocalDate> ard;
    ArrayList<Integer> out;
    String name;

    Device() {
        ard = new ArrayList<>();
        out = new ArrayList<>();
    }

    void describeDev() {
        System.out.println("Maintenance for --> " + name);
    }

    public abstract void start();

    public abstract void stop();

    public abstract void charge();

    public abstract void operate();

}