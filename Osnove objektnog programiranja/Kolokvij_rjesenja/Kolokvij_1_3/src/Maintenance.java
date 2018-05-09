import java.time.LocalDate;
import java.util.ArrayList;

public interface Maintenance {

    ArrayList<LocalDate> scheduledMaintenance();

    ArrayList<Integer> outOfUsage();

}