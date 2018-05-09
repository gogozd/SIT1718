import java.util.Date;

public class Vehicle {

  protected String brand;
  protected String model;
  protected Date year;
  private int vehicleID;

  public Vehicle(){
  }  
    public Vehicle(String brand){
     System.out.println("A Vehicle from the brand " + brand + " created intentionally!");
     this.brand = brand;
   }

  public void start(){
    System.out.println("Vehicle engine has been started!");
  }

  public void stop(){
    System.out.println("Vehicle engine stopped!");
  }

  public String info(){
    String infoStr;
    infoStr = "Brand: " + brand + ", model: " + model + ", year: " + year + ", ID:" + vehicleID;

    return infoStr;
  }
  
  public String getbrand() {
		return brand;
	}

}