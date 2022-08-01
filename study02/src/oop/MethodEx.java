package oop;

public class MethodEx {
	public static void main(String[] args) {
		int[] numArr = new int[10];
		
		init(numArr);
		printArr(numArr);
		System.out.println();
		System.out.println("------------");
		sort(numArr);
		printArr(numArr);
		
	}
	
	static void init(int[] numArr) {
		for(int i = 0; i < 10; i++) {
			numArr[i] = (int)(Math.random()*10);
		}
	}

	static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]);
		}
		
//		System.out.println(Arrays.toString(arr));
	}
	
	static void sort(int[] arr) {
		for(int i = 0; i < arr.length-1; i++) {
			boolean change = false;
			for(int j = 0; j < arr.length-1-i; j++) {
				if(arr[j] > arr[j+1]) {
					int tmp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1] = tmp;
					change = true;
				}
			}
			if(!change) {
				break;
			}
		}
	}
	
	
}
