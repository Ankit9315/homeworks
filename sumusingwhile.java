package homework;
import java.util.Scanner;
public class sumusingwhile {
	public static void main(String[]aargs) {
		Scanner sc=new Scanner(System.in);
		int a=sc.nextInt();
		int sum=0;
		int i =1;
		while(i<=a){
			sum=sum+i;
			i++;
		}
		System.out.print(sum);
	}
}