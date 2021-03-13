package animalkingdom;

abstract class Animal {

 // All animals consume food the same way
 // Each animal is assigned a unique number, a name, 
 // and year discovered regardless of classification.

 // Fields
	protected int maxId = 0;
	protected int id;
	protected int energy; // altered by moving and eating
	protected String name;
	protected int year;

 // constructor
	public Animal(String name, int year) {
		maxId++;
		id = maxId;
		energy = 1;
		this.name = name;
		this.year = year;
	}

 // All animals can move, breath, reproduce. How they 
 //	do that, so what string should get returned when 
 //	the method is executed, varies by animal type.

 // methods
	void eatFood(int amount) {
		energy += amount;
	}

	abstract String move();
	abstract String breath();
	abstract String reproduce();
	abstract String getName();
	abstract int getYear();

	@Override
	public String toString() {
		return "id = " + id + ", Name = " + name + ", YearNamed = " + year;
	}
}