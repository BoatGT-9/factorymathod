
public class ConcreateShapeFactory extends ShapeFactory{
	public Shape getShape(String shapeType) {
		if("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
		
		} else if ("TRIANGLE".equalsIgnoreCase(shapeType)) {
			
		}
		return null;
	}
}
