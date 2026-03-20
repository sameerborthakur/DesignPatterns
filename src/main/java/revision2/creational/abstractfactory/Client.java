package revision2.creational.abstractfactory;

public class Client
{
	public static void main(String[] args)
	{
		GUIFactory guiFactory = new WindowsGUIFactory();
		Button button = guiFactory.createButton();
		Checkbox checkbox = guiFactory.createCheckbox();
		button.click();
		checkbox.tick();
	}
}
