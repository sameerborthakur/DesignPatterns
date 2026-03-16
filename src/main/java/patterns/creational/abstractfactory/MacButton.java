package patterns.creational.abstractfactory;

public class MacButton implements Button
{
	@Override
	public void draw()
	{
		System.out.println("MacButton");
	}
}
