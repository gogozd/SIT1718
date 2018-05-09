import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Random;

public class App {

    public App() {

    }

    public static void main(String[] args) {
        ArrayList<Device> devicesList = new ArrayList<>();
        Random random = new Random();

        Device server1 = new Server("FirstSer");
        server1.scheduledMaintenance().add(LocalDate.of(1999,5, 23));
        server1.outOfUsage().add(random.nextInt(50));
        server1.scheduledMaintenance().add(LocalDate.of(2001,9, 18));
        server1.outOfUsage().add(random.nextInt(50));
        server1.scheduledMaintenance().add(LocalDate.of(2005,7, 16));
        server1.outOfUsage().add(random.nextInt(50));
        server1.scheduledMaintenance().add(LocalDate.of(2010,11, 8));
        server1.outOfUsage().add(random.nextInt(50));
        devicesList.add(server1);

        Device server2 = new Server("SecondSer");
        server2.scheduledMaintenance().add(LocalDate.of(1999,5, 23));
        server2.outOfUsage().add(random.nextInt(50));
        server2.scheduledMaintenance().add(LocalDate.of(2001,9, 18));
        server2.outOfUsage().add(random.nextInt(50));
        server2.scheduledMaintenance().add(LocalDate.of(2005,7, 16));
        server2.outOfUsage().add(random.nextInt(50));
        devicesList.add(server2);

        Device server3 = new Server("ThirdSer");
        server3.scheduledMaintenance().add(LocalDate.of(2005,7, 16));
        server3.outOfUsage().add(random.nextInt(50));
        server3.scheduledMaintenance().add(LocalDate.of(2010,11, 8));
        server3.outOfUsage().add(random.nextInt(50));
        devicesList.add(server3);

        Elevator elevator1 = new Elevator("FirstElevator");
        elevator1.scheduledMaintenance().add(LocalDate.of(1999,6, 23));
        elevator1.outOfUsage().add(random.nextInt(50));
        elevator1.scheduledMaintenance().add(LocalDate.of(2004,1, 23));
        elevator1.outOfUsage().add(random.nextInt(50));
        devicesList.add(elevator1);

        Elevator elevator2 = new Elevator("SecondElevator");
        elevator2.scheduledMaintenance().add(LocalDate.of(1999,7, 23));
        elevator2.outOfUsage().add(random.nextInt(50));
        elevator2.scheduledMaintenance().add(LocalDate.of(2004,3, 23));
        elevator2.outOfUsage().add(random.nextInt(50));
        devicesList.add(elevator2);

        Elevator elevator3 = new Elevator("ThirdElevator");
        elevator3.scheduledMaintenance().add(LocalDate.of(2004, 1, 3));
        elevator3.out.add(random.nextInt(50));
        devicesList.add(elevator3);

        printMaintenances(devicesList);
    }

    private static void printMaintenances(ArrayList<Device> devicesList) {
        for (Device device : devicesList) {
            device.describeDev();

            int totalDays = 0;

            for (LocalDate date : device.scheduledMaintenance()) {
                System.out.println(date.toString());
            }

            for (Integer integer : device.out) {
                totalDays += integer;
            }

            System.out.println();
            System.out.println("Total number of days out of usage for " + device.name + " " + totalDays);
            System.out.println("--------------------------");
        }
    }

}