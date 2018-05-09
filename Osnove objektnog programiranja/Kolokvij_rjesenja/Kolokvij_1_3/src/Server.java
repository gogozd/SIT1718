import java.time.LocalDate;
import java.util.ArrayList;

public class Server extends Device {

    Server(String serName) {
        this.name = serName;
    }

    @Override
    public void start() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void charge() {

    }

    @Override
    public void operate() {

    }

    public static String getUrlSource() {
        return null;
    }


    public ArrayList<LocalDate> getArd() {
        return ard;
    }

    public ArrayList<Integer> getOut() {
        return out;
    }


    @Override
    public ArrayList<LocalDate> scheduledMaintenance() {
        return ard;
    }

    @Override
    public ArrayList<Integer> outOfUsage() {
        return out;
    }

    public String getSerName() {
        return name;
    }

}