package entities;

import entities.enums.Color;

public class Rectangle_ extends Shape{

	private double width;
	private double height;
	
	public Rectangle_() {
		super();
	}
	
	public Rectangle_(Double width, double height) {
		this.width = width;
		this.height = height;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	@Override
	public double area() {
		return height * width;
	}
	
}
