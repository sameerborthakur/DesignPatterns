package revision1.creational.factorymethod;

public class ShapeFactory
{
	public static Shape getShape(String shapeType){
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
