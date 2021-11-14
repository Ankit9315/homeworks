package homework;

import java.util.Scanner;

public class sumusingfor {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		for(int i =1;i<=a;i++) {
			sum=sum+i;
		}
		System.out.print(sum);
	}

}
