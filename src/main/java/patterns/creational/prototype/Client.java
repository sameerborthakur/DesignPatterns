package patterns.creational.prototype;

public class Client
{
	public static void main(String[] args)
	{
		Address address = new Address("Baruah Chariali");
		Person original = new Person("Thor",address);
		Person cloned = original.clone();
		System.out.println("original: " + original);
		System.out.println("cloned: " + cloned);

		cloned.getAddress().setCity("Pluto");
		System.out.println("original: " + original);
		System.out.println("cloned: " + cloned);

	}
}
