package patterns.structural.bridge;

public class BlueDraw implements DrawAPI
{
	@Override
	public void drawCircle(int radius)
	{
		System.out.println("Drawing Circle with Blue and radius: " + radius);
	}

	@Override
	public void drawRectangle(int width, int height)
	{
		System.out.println("Drawing Rectangle with Blue and width: " + width + ", height:" + height);
	}
}
