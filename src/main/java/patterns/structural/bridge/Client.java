package patterns.structural.bridge;

public class Client
{
	public static void main(String[] args)
	{
		Shape shape1 = new Circle(new RedDraw(),18);
		Shape shape2 = new Rectangle(new BlueDraw(),10,20);
		shape1.draw();
		shape2.draw();
	}
}
