import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDate;
import java.util.concurrent.ThreadLocalRandom;

public class SpaceShip {
	
	private String name;
	private int id;
	private int noMissions;
	private LocalDate fstFlight;
	
	public SpaceShip(String name, int id, int j) {
		System.out.println("SpaceShip: " + name + " - id: " + id);
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getNoMissions() {
		return noMissions;
	}

	public void setNoMissions(int noMissions) {
		this.noMissions = noMissions;
	}

	public LocalDate getFstFlight() {
		return fstFlight;
	}

	public void setFstFlight() {
		LocalDate startDate = LocalDate.of(1980, 1, 1);
		long start = startDate.toEpochDay();
		System.out.println(start);
		
		LocalDate endDate = LocalDate.now();
		long end = endDate.toEpochDay();
		System.out.println(start);
		
		long randomEpochDay = ThreadLocalRandom.current().longs(start, end).findAny().getAsLong();
		System.out.println(LocalDate.ofEpochDay(randomEpochDay));
		
		this.fstFlight = LocalDate.ofEpochDay(randomEpochDay);
	}
	
}
