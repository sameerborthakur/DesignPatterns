package patterns.creational.abstractfactory;

public class WindowsCheckbox implements Checkbox
{
	@Override
	public void draw()
	{
		System.out.println("Windows Checkbox");
	}
}
