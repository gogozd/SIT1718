
public class RollingRobot implements SmartWay {
	
	private String name;
	private String type;
	
	public RollingRobot(String name, String type) {
		this.name = name;
		this.type = type;
	}

	@Override
	public void thinkAboutRoute() {
		System.out.println("A robot can have very few opinions - what do you want to hear from me...");
		
	}

	@Override
	public double toDestination(Position pos1, Position pos2) {
		double distance;
		double zet;
		double velocity = 10;
		double time;
		double fia = deg2rad(pos1.getLatitude());
		double lama = deg2rad(pos1.getLongitude());
		double fib = deg2rad(pos2.getLatitude());
		double lamb = deg2rad(pos2.getLongitude());
		zet = rad2deg(Math.acos(Math.sin(fia) * Math.sin(fib) + Math.cos(fia)*Math.cos(fib)*Math.cos(lamb-lama)));

		distance = (zet/360)*40075;
		time = distance/velocity;
		//potrebno je definirati velocity 10 za Rollingrobot, a 100 za SmartCar

    // vrijeme potrebno za prijeci neku udaljenosti zadanom brzinom jednako je kvocijentu udaljenosti i brzine

		return time; // treba nadopuniti
	}

	/*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts decimal degrees to radians             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double deg2rad(double deg) {
      return (deg * Math.PI / 180.0);
    }

    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    /*::  This function converts radians to decimal degrees             :*/
    /*:::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::::*/
    private static double rad2deg(double rad) {
      return (rad * 180.0 / Math.PI);
    }
}
