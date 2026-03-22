package patterns.structural.bridge;

public class Rectangle extends Shape
{
	int width;
	int height;

	public Rectangle(DrawAPI drawAPI,int width, int height)
	{
		super(drawAPI);
		this.width = width;
		this.height = height;
	}

	@Override
	void draw()
	{
		drawAPI.drawRectangle(width, height);
	}
}
