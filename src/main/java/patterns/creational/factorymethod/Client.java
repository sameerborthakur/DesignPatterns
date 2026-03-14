package patterns.creational.factorymethod;

public class Client
{
	public static void main(String[] args)
	{
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape rectangle = shapeFactory.getShape("Rectangle");
		Shape circle = shapeFactory.getShape("Circle");
		rectangle.draw();
		circle.draw();
	}
}
