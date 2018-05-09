public class Car {

	// Attributes
	private int carSerial;
	private String vehicleRegistrationPlate;
	private String model;
	private String name;
	private String year;

	// Constructors
	public Car() {

	}

	public Car(int prkNum) {

		parkingCar(prkNum);
	}

	// Getters and Setters
	public int getCarSerial() {
		return carSerial;
	}

	public void setCarSerial(int carSerial) {
		this.carSerial = carSerial;
	}

	public String getVehicleRegistrationPlate() {
		return vehicleRegistrationPlate;
	}

	public void setVehicleRegistrationPlate(String vehicleRegistrationPlate) {
		this.vehicleRegistrationPlate = vehicleRegistrationPlate;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getYear() {
		return year;
	}

	public void setYear(String year) {
		this.year = year;
	}

	// Methods
	public void startCar() {

		System.out.println("Starting car engine...");

	}

	public void stopCar() {
		System.out.println("Stoped car engine...");
	}

	public void parkingCar(int prkNum) {
		System.out.println("Parking car with vehicle registration plates: " + vehicleRegistrationPlate);
		System.out.println("Parking number: " + prkNum);
	}

	public void carInfo() {
		System.out.println("Car brand:" + getName() + ", model: " + getModel() + ", vehicle registration plate: "
				+ getVehicleRegistrationPlate());
	}

}