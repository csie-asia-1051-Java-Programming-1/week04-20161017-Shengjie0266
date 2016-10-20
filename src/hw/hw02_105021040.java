package hw;
import java.util.Scanner;

public class hw02_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n=scn.nextInt();
		int m=scn.nextInt();
		int a =n-m;
		int sum1 = 1,sum2 = 1,sum3 = 1;
		for(int v1 =1;v1<=n;v1++){
			sum1=sum1 * v1;
		}
		for(int v2 =1;v2<=m;v2++){
			sum2=sum2 * v2;
		}
		for(int v3 =1;v3<=a;v3++){
			sum3=sum3 * v3;
		}
		System.out.println(sum1/(sum2*sum3));
	}

}
