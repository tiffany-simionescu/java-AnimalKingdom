package animalkingdom;

public class Fish extends Animal {

	// protected int maxId = 0;
	// protected int id;
	// protected int energy; // altered by moving and eating
	// protected String name;
	// protected int year;

	// abstract String move();
	// abstract String breath();
	// abstract String reproduce();
	// abstract String getName();
	// abstract int getYear();

	// Constructor
	public Fish(String name, int year) {
		super(name, year);
	}

	@Override
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	@Override
	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	@Override
	public String move() {
		return "swim";
	}

	@Override
	public String breath() {
		return "gills";
	}

	@Override
	public String reproduce() {
		return "eggs";
	}
}