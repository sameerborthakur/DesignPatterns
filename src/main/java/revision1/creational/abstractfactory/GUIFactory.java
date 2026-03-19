package revision1.creational.abstractfactory;

import patterns.creational.abstractfactory.Checkbox;


public interface GUIFactory
{
	Button createButton();

	Checkbox createCheckbox();
}
