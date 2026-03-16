package patterns.creational.abstractfactory;

public class Client
{
	public static void main(String[] args)
	{
		GUIFactory guiFactory = new MacFactory();
		Button button = guiFactory.createButton();
		Checkbox checkbox = guiFactory.createCheckbox();
		button.draw();
		checkbox.draw();

		guiFactory = new WindowsFactory();
		button = guiFactory.createButton();
		checkbox = guiFactory.createCheckbox();
		button.draw();
		checkbox.draw();
	}
}
