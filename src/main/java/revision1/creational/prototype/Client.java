package revision1.creational.prototype;

public class Client
{
	public static void main(String[] args)
	{
		Address address = new Address("Berlin");
		Person originalPerson = new Person("Tom", address);
		Person clonedPerson = originalPerson.clone();
		System.out.println("Original Person"+originalPerson);
		System.out.println("Cloned Person"+clonedPerson);
		clonedPerson.getAddress().setCity("Barcelona");
		System.out.println("Original Person"+originalPerson);
		System.out.println("Cloned Person"+clonedPerson);
	}
}
