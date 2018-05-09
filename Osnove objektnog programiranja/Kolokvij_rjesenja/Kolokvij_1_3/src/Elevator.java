import java.time.LocalDate;
import java.util.ArrayList;

public class Elevator extends Device {

    private int floor;

    Elevator(String elevId) {
        this.name = elevId;
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

    public int getCurrFloor() {
        return floor;
    }

    public void changeFloor(int floor) {
        this.floor = floor;
    }

    @Override
    public ArrayList<LocalDate> scheduledMaintenance() {
        return ard;
    }

    @Override
    public ArrayList<Integer> outOfUsage() {
        return out;
    }

}