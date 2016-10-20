package hw;
import java.util.Scanner;

public class hw03_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a =0,b=0,c=0;
		int i=0;
		while(i != 999){
			System.out.println("請輸入整數");
			 i =scn.nextInt();
			if(i>0 && i != 999){
				a += 1;
			}else 
			if(i==0){
				b += 1;
			}else
			if(i<0){
				c += 1;
			}
			System.out.println("正數有:"+ a +"個");
			System.out.println("零有:"+ b +"個");
			System.out.println("負數有:"+ c +"個");
	}

}
}