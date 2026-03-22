package revision3.creational.factory;

public class Client
{
	public static void main(String[] args)
	{
		ShapeFactory  shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.createShape("Rectangle");
		Shape shape2 = shapeFactory.createShape("Circle");
		shape1.draw();
		shape2.draw();
	}
}
