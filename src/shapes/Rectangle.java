package shapes;

public class Rectangle <T extends Number> extends Polygon<T>{

	T length;
	T width;
	
	public Rectangle(T length, T width) {
		super(4);	//rectangle has 4 corners
		this.length = length;
		this.width = width;
	}
	
	@Override
	public Number area() {
		return ((Number) length).doubleValue() * ((Number) width).doubleValue();
	}

	@Override
	public Number perimeter() {
		return (2* ((Number) length).doubleValue()) + (2 * ((Number) width).doubleValue());
	}
	
	@Override
	public String toString() {
		return "Rectangle (Length " + this.length + ") (Width " + this.width + ") (Area " + this.area() + ") (" + this.perimeter() + ")";
	}

}
