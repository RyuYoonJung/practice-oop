package makeRect;

public class RectApp {
	public static void main(String[] args) {
		
		Rectangle rectangle = new Rectangle(5, 6, 1, 9);

		System.out.println(rectangle);
		System.out.println(rectangle.getArea());
		System.out.println(rectangle.getHeight());
		System.out.println(rectangle.getRound());
		System.out.println(rectangle.getWidth());
		rectangle.display();
		
		Rectangle[] rectangles = new Rectangle[3];
		rectangles[0] = new Rectangle(5, 6, 7, 9);
		rectangles[1] = new Rectangle(5, 6, 8, 9);
		rectangles[2] = new Rectangle(2, 6, 7, 9);
		
		for(Rectangle r : rectangles) {
			System.out.println(r);
		}
		
		
	}
}
