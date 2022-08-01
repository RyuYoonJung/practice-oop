package oop;

public class BlockTest {
	static {
		System.out.println("static()");
	}
	
	{
		System.out.println("{ }");
	}
	
	public BlockTest() {
		System.out.println("생성자");
	}
	
	public static void main(String[] args) {
		BlockTest blockTest = new BlockTest();
		BlockTest blockTest2 = new BlockTest();
		
		
	}
	
}
