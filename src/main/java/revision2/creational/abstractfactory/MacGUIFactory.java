package revision2.creational.abstractfactory;

public class MacGUIFactory implements GUIFactory
{
	@Override
	public Button createButton()
	{
		return new MacOSButton();
	}

	@Override
	public Checkbox createCheckbox()
	{
		return new MacOSCheckbox();
	}
}
