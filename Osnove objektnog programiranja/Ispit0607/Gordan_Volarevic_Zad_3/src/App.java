
public class App {

	public static void main(String[] args) {

		RollingRobot rr = new RollingRobot("R2D2", "RollingRobot");
		rr.thinkAboutRoute();
		System.out.println(rr.toDestination(new Position(43.5081323, 16.440193499999964), new Position(34.5081323, 19.440193499999964)));
		
		SmartCar sc = new SmartCar("Tesla", "SmartCar");
		sc.thinkAboutRoute();
		System.out.println(sc.toDestination(new Position(43.5081323, 16.440193499999964), new Position(34.5081323, 19.440193499999964)));
		
		Car ca = new Car("Rimac", "Car");
		ca.describeVehicle();
		
		Truck tr = new Truck("Pulic", "Truck");
		tr.describeVehicle();
	}

}
