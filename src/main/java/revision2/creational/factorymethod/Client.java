package revision2.creational.factorymethod;

public class Client
{
	public static void main(String[] args)
	{
		ShapeFactory  shapeFactory = new ShapeFactory();
		Shape shape1 = shapeFactory.createShape("Rectangle");
		shape1.draw();
		Shape shape2 = shapeFactory.createShape("Circle");
		shape2.draw();
	}
}
