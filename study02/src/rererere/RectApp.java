package rererere;

import java.util.Arrays;

public class RectApp {
	public static void main(String[] args) {
		// 사각형 정보 출력
		Rectangle2 r2 = new Rectangle2(3, 10, 7, 5);
//		System.out.println(r2);
//		System.out.println("높이 :: " + r2.getHeight());
//		System.out.println("너비 :: " + r2.getWidth());
//		System.out.println("둘레 :: " + r2.getRound());
//		System.out.println("넓이 :: " + r2.getArea());
//		System.out.println();
//		Rectangle2 r3 = new Rectangle2(2, 15, 9, 11);
//		
//		System.out.println("높이 :: " + r3.getHeight());
//		System.out.println("너비 :: " + r3.getWidth());
//		System.out.println("둘레 :: " + r3.getRound());
//		System.out.println("넓이 :: " + r3.getArea());
//		System.out.println();
		
		System.out.println("----");
		r2.display();
		System.out.println("---toString 출력---");
		System.out.println(r2.toString());
		System.out.println(r2);
		System.out.println();
		System.out.println("--사각형 배열[3]--");
		
		Rectangle2[] rectArr = new Rectangle2[3];
		System.out.println(Arrays.toString(rectArr));
		rectArr[0] = new Rectangle2(3, 10, 7, 5);
		rectArr[1] = new Rectangle2(4, 14, 7, 3);
		rectArr[2] = new Rectangle2(5, 8, 7, 9);
		int len = rectArr.length;
		System.out.println("----==============-");
		for(int i = 0; i < len; i++) {
			System.out.println(rectArr[i]);
		}
		
		System.out.println("===========향상for문================");
		for(Rectangle2 r : rectArr) {
			System.out.println(r);
		}
		
	}
}
