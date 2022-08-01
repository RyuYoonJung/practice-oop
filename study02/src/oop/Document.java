package oop;

public class Document {
	
	public static int count = 0;
	public String name;
	
	public Document() {
		this("제목없음" + ++count);
	}
	
	public Document(String name) {
		this.name = name;
		System.out.println("문서 " + this.name  + "가 생성되었습니다");
	}
}


//public class DocumentTest{
//	public static void main(String[] args) {
//	
//		int b;
//		Document document = new Document();
//		Document document2 = new Document("자바");
//	}
//}

