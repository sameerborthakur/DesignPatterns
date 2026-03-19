package revision1.creational.abstractfactory;

import patterns.creational.abstractfactory.Checkbox;


public class Client
{
	public static void main(String[] args)
	{
		GUIFactory guiFactory = new MacGUIFactory();
		Button button = guiFactory.createButton();
		Checkbox checkbox = guiFactory.createCheckbox();
		button.draw();
		checkbox.draw();

		guiFactory = new WindowsGUIFactory();
		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
		button.draw();
		checkbox.draw();
	}
}
