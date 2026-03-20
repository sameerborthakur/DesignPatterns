package revision2.creational.abstractfactory;


public class WindowsCheckBox implements Checkbox
{
	@Override
	public void tick()
	{
		System.out.println("Windows Checkbox ticked");
	}
}
