package ezen.shape;

public class Lectangle extends Shape {

	protected double width, height;

	public Lectangle() {
	}

	public Lectangle(double x, double y, double width, double height) {
		this.x = x;
		this.y = y;
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
	public void draw() {
		System.out.println(getX() + "," + getY() + "위치의 폭이" + width + "이고 높이가" + height + "인 사각형 입니다.");
	}

	@Override
	public double getLength() {
		return 2 * (width + height);
	}

	@Override
	public double getArea() {
		return width * height;
	}

}
