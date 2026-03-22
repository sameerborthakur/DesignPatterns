package patterns.structural.bridge;

public class Circle extends Shape
{
	int radius;

	public Circle(DrawAPI drawAPI, int radius)
	{
		super(drawAPI);
		this.radius = radius;
	}

	@Override
	void draw()
	{
		drawAPI.drawCircle(radius);
	}
}
