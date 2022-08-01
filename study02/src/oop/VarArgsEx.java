package oop;

import java.util.Arrays;

public class VarArgsEx {
	public static void main(String[] args) {
		String[] strArr = {"100", "200", "300"};
		System.out.println(concatenate("-", "a", "b", "c", strArr[0], Arrays.toString(strArr)));
		System.out.println(concatenate("-", "a"));
	}
	
	static String concatenate(String...args) {
		String result = "";
		
		for(String str : args) {
			result += str   ;
		}
		return result;
	}
	
}
