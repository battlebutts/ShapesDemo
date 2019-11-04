package shapes;

public class Triangle <T extends Number> extends Polygon<T> {
	
	T base;
	T height;
	
	public Triangle(T base, T height) {
		super(3);		//triangle has 3 corners
		this.base = base;
		this.height = height;
	}

	@Override
	public Number area() {
		return (1.0/2.0) * ((Number) base).doubleValue() * ((Number) height).doubleValue();
	}

	@Override
	public Number perimeter() { //ASSUMING EQUILATERAL TRIANGLE
		return 3.0 * ((Number) base).doubleValue();
	}
	
	@Override
	public String toString() {
		return "Triangle (Base " + this.base + ") (Height " + this.height + ") (Area " + this.area() + ") (" + this.perimeter() + ")";
	}

}
