public class App {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ParkingLot parking = new ParkingLot(101);
		// Creating car objects
		Car car1 = new Car();
		Car car2 = new Car();
		Car car3 = new Car();
		// Setting required att. values for Car objects
		car1.setCarSerial(45897);
		car1.setModel("Focus");
		car1.setName("Ford");
		car1.setVehicleRegistrationPlate("CRO-23B-12");

		car2.setCarSerial(3242);
		car2.setModel("Megane");
		car2.setName("Renault");
		car2.setVehicleRegistrationPlate("CRO-212-1C");

		car3.setCarSerial(53476);
		car3.setModel("Yaris");
		car3.setName("Toyota");
		car3.setVehicleRegistrationPlate("CRO-A11-1V");



		car1.carInfo();
		car2.carInfo();
		car3.carInfo();

		parking.registerCar(car1);
		parking.registerCar(car2);
		parking.registerCar(car3);

		parking.listAllCarsParking();

		parking.releaseParkingPlace(parking.getParkingList().indexOf(car1));

		parking.listAllCarsParking();


	}

}