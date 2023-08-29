package factoryMathod;

public class factoryMethodDemo {

	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ConcreateShapeFactory();
		
		Shape shape1 = ((ShapeFactory) shapeFactory).getShape("tringle");
		shape1.draw();
	}

}
