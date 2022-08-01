package makeRect;

public class Rectangle {
	Point point1;
	Point point2;
	
	public Rectangle() {
		// TODO Auto-generated constructor stub
	}

	public Rectangle(int x, int y, int x1, int y1) {
		point1 = new Point(x, y);
		point2 = new Point(x1, y1);
	}
	
	// 너비
	int getWidth() {
		return abs(point1.x - point2.x);
	}
	
	// 높이
	int getHeight() {
		return abs(point1.y - point2.y);
	}

	// 넓이
	int getArea() {
		return getWidth() * getHeight();
	}
	
	// 둘레
	int getRound() {
		return (getWidth() + getHeight())*2;
	}
	
	// 절대값
	int abs(int x) {
		return x < 0 ? -x : x;
	}

	// 사각형 출력
	void display() {
		System.out.println("d" + getWidth());
		System.out.println("d" + getHeight());
		System.out.println("d" + getArea());
		System.out.println("d" + getRound());
	}
	
	@Override
	public String toString() {
		return "[너비 :: " + getWidth() + "] [높이 :: " + getHeight() + "] [넓이 :: " + getArea() + "] [둘레 :: " + getRound() + "]";
	}
}
