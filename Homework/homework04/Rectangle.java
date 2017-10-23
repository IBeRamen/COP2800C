package homework04;

public class Rectangle {

	double width, height;
	
	Rectangle() {
		width = 1;
		height = 1;
	}
	
	Rectangle(double w, double h) {
		width = w;
		height = h;
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
	
	public double getArea() {
		return width * height;
	}
	
	public double getPerimeter() {
		return (width * 2) + (height * 2);
	}
	
	public String toString() {
		return "Rectangle Created!\n"
				+ "Width: " + width
				+ "\nLength: " + height;
	}

}
