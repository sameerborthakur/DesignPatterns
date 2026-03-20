package revision1.creational.prototype;

public class Address implements Cloneable
{
	public String city;

	public Address(String city){
		this.city = city;
	}
	public String getCity()
	{
		return city;
	}

	public void setCity(String city)
	{
		this.city = city;
	}

	public Address clone()
	{
		try
		{
			return (Address)super.clone();
		}
		catch(CloneNotSupportedException e)
		{
			e.printStackTrace();
		}
		return null;
	}

	public String toString()
	{
		return city;
	}
}
