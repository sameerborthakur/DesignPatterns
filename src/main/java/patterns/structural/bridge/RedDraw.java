package patterns.structural.bridge;

public class RedDraw implements DrawAPI
{

	@Override
	public void drawCircle(int radius)
	{
		System.out.println("Drawing Circle with Red and radius: " + radius);
	}

	@Override
	public void drawRectangle(int width, int height)
	{
		System.out.println("Drawing Rectangle with Red and width: " + width + ", height:" + height);
	}
}
