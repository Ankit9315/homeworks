package homework;

import java.util.Scanner;

public class swappingwithoutthirdvariable {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		a=b-a;
		b=b-a;
		a=b+a;
		System.out.println(a);
		System.out.println(b);
	}
}
