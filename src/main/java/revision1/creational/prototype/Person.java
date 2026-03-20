package revision1.creational.prototype;

import java.security.PublicKey;


public class Person implements Prototype<Person>
{
	public String name;
	public Address address;

	public Person(String name, Address address)
	{
		this.name = name;
		this.address = address;
	}
	@Override
	public Person clone()
	{
		Address address = this.address!=null ? this.address.clone() : null;
		return new Person(name, address);
	}

	public Address getAddress()
	{
		return address;
	}

	public String getName()
	{
		return name;
	}

	public void setAddress(Address address)
	{
		this.address = address;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public String toString()
	{
		return "Person name:"+name+" address:"+address;
	}
}
