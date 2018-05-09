import java.util.ArrayList;
import java.util.concurrent.ThreadLocalRandom;

public class ParkingLot {

 private int parkingID;
 private ArrayList<Car> someCars;
 private static int cap = 35;
 private static int cnt = 0;

 public ParkingLot(int prkID) {
   this.parkingID = prkID;
   someCars = new ArrayList<>(cap);
   for (int i = 0; i < cap; i++) {
     someCars.add(null);
   }
   System.out.println("Size: " + someCars.size());
 }

 public void registerCar(Car cr) {

   int rnNum = ThreadLocalRandom.current().nextInt(0, cap);
   cr.parkingCar(rnNum);
   someCars.add(rnNum, cr);
   cnt++;

 }

 public void listAllCarsParking() {

   int pp;
   int endIndx;

   // Remove additional ArrayList elements to maintain parking defined capacity
   if (ParkingLot.getNumRegCars() > 0 & someCars.size() > cap) {

     for (int i = 1; i <= ParkingLot.getNumRegCars(); i++) {

       endIndx = someCars.size() - 1;
       someCars.remove(endIndx);

     }

   }

   System.out.println("////////////////////////////////////////////////////");
   System.out.println("List of cars in parking lot with ID: " + parkingID);

   for (int i = 0; i < someCars.size(); i++) {

     if (someCars.get(i) == null) {
       pp = i + 1;
       System.out.println("No car on the parking place: " + pp);
     } else {
       pp = someCars.indexOf(someCars.get(i)) + 1;
       System.out.println("----------------------------------------------");
       someCars.get(i).carInfo();
       System.out.println("Parking place of that car is: " + pp);
       System.out.println("----------------------------------------------");

     }

   }
 }

 public static int getNumRegCars() {

   return cnt;
 }

 public void releaseParkingPlace(int parkPlace) {

   someCars.remove(parkPlace);
   // Add null on that positon
   someCars.add(parkPlace, null);

 }

 public ArrayList<Car> getParkingList(){

   return someCars;
 }

}