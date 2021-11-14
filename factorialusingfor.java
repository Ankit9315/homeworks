package homework;

import java.util.Scanner;

public class factorialusingfor {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			int i=1;
			for(int b=1;b<=a;b++) {
				i=i*b;
				
			}
			System.out.println(i);
		}
}
