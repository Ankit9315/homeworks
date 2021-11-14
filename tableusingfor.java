package homework;

import java.util.Scanner;

public class tableusingfor {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		for(int i=1;i<=10;i++) {
			int b=a*i;
			System.out.println(a+"*"+i+"="+b);
		}
	}
}
