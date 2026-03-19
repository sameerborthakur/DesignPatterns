package patterns.creational.prototype;

public class Person implements Prototype<Person>
{
	public String name;
	public Address address;

	Person(String name, Address address)
	{
		this.name = name;
		this.address = address;
	}
	@Override
	public Person clone()
	{
		Address newAddress = address!=null ? address.clone() : null;
		return new Person(this.name,newAddress);
	}

	public String toString()
	{
		return "Person [name=" + name + ", address=" + address + "]";
	}
	public Address getAddress()
	{
		return address;
	}

	public String getName()
	{
		return name;
	}
}
