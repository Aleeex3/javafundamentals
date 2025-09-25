package oopmodeling.solarsystem;

public class CelestialBody {
	public float gravity = 444444444444444444444444444444.4f;
	// Los miembros publicos se puede acceder directamente desde cualquier clase 
	 protected double mass = 444444444444444444444565656564565644444444.4656565656565;
	 // Los miembros protegidos solo visibles para sus descendientes
	 private boolean hasOxygen = false;
	// Los miembros privados de una clase no se pueden llamar desde otra clase
	String name = "unknown";
	float radius = 234234;
	int age = 232676753;//the unit is million
	// Los miembros estaticos de una clase , solo existe una solo copia en la memoria
	public static float MINIMUM_SIZE = 675676.4f;
	/**
	 * @return the gravity
	 */
	public float getGravity() {
		return gravity;
	}
	/**
	 * @param gravity the gravity to set
	 */
	public void setGravity(float gravity) {
		this.gravity = gravity;
	}
	/**
	 * @return the mass
	 */
	public double getMass() {
		return mass;
	}
	/**
	 * @param mass the mass to set
	 */
	public void setMass(double mass) {
		this.mass = mass;
	}
	/**
	 * @return the hasOxygen
	 */
	public boolean isHasOxygen() {
		return hasOxygen;
	}
	/**
	 * @param hasOxygen the hasOxygen to set
	 */
	public void setHasOxygen(boolean hasOxygen) {
		this.hasOxygen = hasOxygen;
	}
	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}
	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * @return the radius
	 */
	public float getRadius() {
		return radius;
	}
	/**
	 * @param radius the radius to set
	 */
	public void setRadius(float radius) {
		this.radius = radius;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}

	public static void doSomething() {
		System.out.println("do something");	
	}
}
