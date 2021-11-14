package homework;

import java.util.Scanner;

public class tablesusingwhile {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int i=1;
		while(i<=10) {
			int b=a*i;
			System.out.println(a+"*"+i+"="+b);
			i++;
		}
	}
}
