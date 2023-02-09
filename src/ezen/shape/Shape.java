package ezen.shape;

/**
 * 모든 도형의 공종적인 속성과 기능 정의
 * 
 * @author 김현아
 * @date 2023. 1. 4.
 */
public abstract class Shape {
	protected double x, y;

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return y;
	}

	public void setY(double y) {
		this.y = y;
	}

	public abstract void draw();

	public abstract double getLength();

	public abstract double getArea();

}
