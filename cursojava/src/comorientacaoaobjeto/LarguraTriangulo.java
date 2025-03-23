package comorientacaoaobjeto;

public class LarguraTriangulo {
	public double width;
	public double height;

	public double area() {
		return width * height;
	}

	public double diagonal() {
		double c = (Math.pow(width, 2)) + (Math.pow(height, 2));
		return Math.sqrt(c);
	}

	public double perimeter() {
		return width + height + diagonal();
	}
}
