package animalkingdom;

import java.util.List;
import java.util.ArrayList;

public class Main {

	private static List<Animal> filterAnimals(List<Animal> animals, CheckAnimal tester) {
		List<Animal> tempList = new ArrayList<>();

		for (Animal a : animals) {
			if (tester.test(a)) {
				tempList.add(a);
			}
		}
		return tempList;
	}


	public static void main(String[] args) {

		// Mammals
		Mammal panda = new Mammal("Panda", 1869);
		Mammal zebra = new Mammal("Zebra", 1778);
		Mammal koala = new Mammal("Koala", 1816);
		Mammal sloth = new Mammal("Sloth", 1804);
		Mammal armadillo = new Mammal("Armadillo", 1758);
		Mammal raccoon = new Mammal("Raccoon", 1758);
		Mammal bigfoot = new Mammal("Bigfoot", 2021);

		// Birds
		Bird pigeon = new Bird("Pigeon", 1837);
		Bird peacock = new Bird("Peacock", 1821);
		Bird toucan = new Bird("Toucan", 1758);
		Bird parrot = new Bird("Parrot", 1824);
		Bird swan = new Bird("Swan", 1758);

		// Fish
		Fish salmon = new Fish("Salmon", 1758);
		Fish catfish = new Fish("Catfish", 1817);
		Fish perch = new Fish("Perch", 1758);

		// List of animals
		List<Animal> animalList = new ArrayList<>();

		// Add animals to list
		animalList.add(panda);
		animalList.add(zebra);
		animalList.add(koala);
		animalList.add(sloth);
		animalList.add(armadillo);
		animalList.add(raccoon);
		animalList.add(bigfoot);
		animalList.add(pigeon);
		animalList.add(peacock);
		animalList.add(toucan);
		animalList.add(parrot);
		animalList.add(swan);
		animalList.add(salmon);
		animalList.add(catfish);
		animalList.add(perch);

		System.out.println("\n*** List all the animals in descending order by year named ***");
		animalList.sort((a1, a2) -> a2.getYear() - a1.getYear());
		animalList.forEach((a) -> System.out.println(a));

		System.out.println("\n*** List all the animals alphabetically ***");
		animalList.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		animalList.forEach((a) -> System.out.println(a));

		System.out.println("\n*** List all the animals order by how they move ***");
		animalList.sort((a1, a2) -> a1.move().compareToIgnoreCase(a2.move()));
		animalList.forEach((a) -> System.out.println(a));

		System.out.println("\n*** List only those animals that breath with lungs ***");
		List<Animal> withLungsList = filterAnimals(animalList, (a) -> a.breath() == "lungs");
		withLungsList.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println("\n*** List only those animals that breath with lungs and were named in 1758 ***");
		List<Animal> withLungs1758List = filterAnimals(withLungsList, (a) -> a.getYear() == 1758);
		withLungs1758List.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println("\n*** List only those animals that lay eggs and breath with lungs ***");
		List<Animal> withLungsEggsList = filterAnimals(withLungsList, (a) -> a.reproduce() == "eggs");
		withLungsEggsList.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		System.out.println("\n*** List alphabetically only those animals that were named in 1758 ***");
		List<Animal> namedIn1758List = filterAnimals(animalList, (a) -> a.getYear() == 1758);
		namedIn1758List.sort((a1, a2) -> a1.getName().compareToIgnoreCase(a2.getName()));
		namedIn1758List.forEach((a) -> System.out.println(a.getName() + " " + a.reproduce() + " " + a.move() + " " + a.breath() + " " + a.getYear()));

		// STRETCH GOAL
		System.out.println("\n*** Stretch Goal ***");

		System.out.println("\n*** For the list of animals, list alphabetically those animals that are mammals ***");
		List<Animal> mammalList = filterAnimals(animalList, (a) -> a instanceof Mammal);
		mammalList.sort((m1, m2) -> m1.getName().compareToIgnoreCase(m2.getName()));
		mammalList.forEach((m) -> System.out.println(m.getName() + " " + m.reproduce() + " " + m.move() + " " + m.breath() + " " + m.getYear()));
	}	
}