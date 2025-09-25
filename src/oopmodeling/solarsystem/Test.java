package oopmodeling.solarsystem;

public class Test {

	public static void main(String[] args) {
		
		Planet mercury = new Planet(0);
		Planet mars = new Planet(34);
		System.out.println(mercury.age);
	mercury.doSomething();
	mars.doSomething();
	mercury.setAge(1000);
	// Los miembros estaticos de una clase se accedden con el  nombre 
	// de la clase, no los nombres de los objetos de la misma clase,
	// pq los estaticos no estan asociados con cualquier objeto especifico
	
	Planet.doSomething();
	Planet.MINIMUM_SIZE = 234;

	}
}
