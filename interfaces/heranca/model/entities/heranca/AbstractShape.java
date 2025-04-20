package model.entities.heranca;

import model.enums.Color;

public abstract class AbstractShape implements Shape {

	private Color Color;

	public AbstractShape(model.enums.Color color) {
		super();
		Color = color;
	}

	public Color getColor() {
		return Color;
	}

	public void setColor(Color color) {
		Color = color;
	}
	
	 
}
