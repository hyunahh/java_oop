package ezen.shape;

public class Circle extends Shape {
	
	protected double radian;

	public Circle() {
	}

	public Circle(double x, double y, double radian) {
		this.x = x;
		this.y = y;
		this.radian = radian;
	}

	public double getRadian() {
		return radian;
	}

	public void setRadian(double radian) {
		this.radian = radian;
	}

	@Override
	public void draw() {
		System.out.println(getX() + "," + getY() + "위치의" + radian + " 인 원입니다.");
	}

	@Override
	public double getLength() {
		return 2 * Math.PI * radian;
	}

	@Override
	public double getArea() {
//		return Math.PI * radian * radian;
		return Math.PI * Math.pow(radian, 2);
	}

}
