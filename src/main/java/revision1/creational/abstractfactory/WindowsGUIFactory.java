package revision1.creational.abstractfactory;

import patterns.creational.abstractfactory.Checkbox;


public class WindowsGUIFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new WindowsButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new WindowsCheckbox();
	}
}
