package patterns.creational.prototype;

public class Address implements Cloneable
{
	private String city;

	Address(String city)
	{
		this.city = city;
	}

	@Override
	public Address clone()
	{
		try
		{
			return (Address) super.clone();
		}
		catch (CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public String toString()
	{
		return city;
	}
	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}
}
