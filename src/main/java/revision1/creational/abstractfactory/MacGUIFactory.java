package revision1.creational.abstractfactory;

import patterns.creational.abstractfactory.Checkbox;


public class MacGUIFactory implements GUIFactory
{

	@Override
	public Button createButton()
	{
		return new MacButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new  MacCheckbox();
	}
}
