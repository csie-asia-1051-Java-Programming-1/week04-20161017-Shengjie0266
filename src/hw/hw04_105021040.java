package hw;
import java.util.Scanner;

public class hw04_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int val=0;
		while(val!=4){
			System.out.println("請輸入1~4");
			val = scn.nextInt();
			switch(val){
			case 1:
				System.out.println("請輸入正整數n");
				int h = scn.nextInt();
				int n=(h+1)/2;
				int flat=0;
				for(int a=1;a<=h;a++){
					for(int b=1;b<=n;b++){
						System.out.print("*");
					}
					System.out.println("");
//					System.out.print(n);
					if(flat==0 && n>0){
						n--;
					}
					if(flat==1&&n<(h+1)/2){
						n++;
					}
					if(n==1){
						flat=1;
					}
				}
				break;
			}
		}
		System.out.print("掰掰");
	}

}
