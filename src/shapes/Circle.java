package shapes;

public class Circle <T extends Number> implements TwoDShape<T>{
	
	T radius;
	
	public Circle(T radius) {
		this.radius = radius;
	}
	
	@Override
	public Number area() {
		return ((Number) radius).doubleValue() * Math.PI;
	}

	@Override
	public Number perimeter() {
		return Math.PI * 2 * ((Number) radius).doubleValue();
	}
	
	@Override
	public String toString() {
		return "Circle (Radius " + this.radius + ") (Area " + this.area() + ") (" + this.perimeter() + ")";
	}

}
