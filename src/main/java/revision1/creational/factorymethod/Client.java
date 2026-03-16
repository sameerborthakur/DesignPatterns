package revision1.creational.factorymethod;

public class Client
{
	public static void main(String[] args)
	{
		Shape shape1 = ShapeFactory.getShape("Rectangle");
		Shape shape2 = ShapeFactory.getShape("Circle");
		shape1.draw();
		shape2.draw();
	}
}
