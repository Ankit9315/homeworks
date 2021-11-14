package homework;

import java.util.Scanner;

public class factorialusingwhile {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
			int i=1;
			int b=1;
			while(b<=a) {
				i=i*b;
				b++;
			}
			System.out.println(i);
		}
}
