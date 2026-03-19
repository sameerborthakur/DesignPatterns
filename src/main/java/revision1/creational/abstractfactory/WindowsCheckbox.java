package revision1.creational.abstractfactory;

import patterns.creational.abstractfactory.Checkbox;


public class WindowsCheckbox implements Checkbox
{
	@Override
	public void draw()
	{
		System.out.println("This is a Windows Checkbox");
	}
}
