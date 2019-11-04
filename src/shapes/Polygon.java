package shapes;

public abstract class Polygon<T extends Number> implements TwoDShape<T> {

	int corners;
	
	public Polygon(int corners) {
		this.corners = corners;
	}
	
}
