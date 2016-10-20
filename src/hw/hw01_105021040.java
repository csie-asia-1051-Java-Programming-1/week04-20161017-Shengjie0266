package hw;
import java.util.Scanner;

public class hw01_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int n = scn.nextInt();
		int b = 1,c = 0,sum = 0;
		for(int v =1;v<=n;v++){
			sum = b + c;
			System.out.print(sum +"\t");
			b=c;
			c=sum;
		}
	}

}
