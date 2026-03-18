package revision2.creational.factorymethod;

public class ShapeFactory
{
	public Shape createShape(String shapeType)
	{
		if(shapeType==null){
			return null;
		}
		if(shapeType.equalsIgnoreCase("Rectangle")){
			return new Rectangle();
		}
		else if(shapeType.equalsIgnoreCase("Circle")){
			return new Circle();
		}
		return null;
	}
}
