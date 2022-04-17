package SampleProg;

import java.awt.List;
import java.lang.reflect.Array;
import java.util.ArrayList;

public class Prog {
	
	public static void main(String[] args) {
		String s = "Java, React, HTML, CSS";
		String[] str = s.split(",");
		for (String string : str) {
			System.out.println(string);
		}
		
		String sa = "hello";
		String rev = "";
		for (int i=s.length()-1; i>=0; i--) {
			
			rev = rev+s.charAt(i);
			System.out.println(rev);
		}
		
//		int a = 50;
//		int b = 20;
//		int max = a>b?a:b;
//		System.out.println(max);
		
		
	}

}
