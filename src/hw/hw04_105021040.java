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
				int h1 = scn.nextInt();
				int n=(h1+1)/2;
				int flat=0;
				for(int a=1;a<=h1;a++){
					for(int b=1;b<=n;b++){
						System.out.print("@");
					}
					System.out.println("");
//					System.out.print(n);
					if(flat==0 && n>0){
						n--;
					}
					if(flat==1&&n<(h1+1)/2){
						n++;
					}
					if(n==1){
						flat=1;
					}
				}
			case 2:
				int h2=scn.nextInt();
				int m=1;
				int flat1=0;
				for(int a1=1;a1<=h2;a1++){
					for(int b1=1;b1<=m;b1++){
						System.out.print("%");
					}
					System.out.println("");
					if(flat1==0 && m<(h2+1)/2){
						m++;
					}
					if(flat1==1 && m>=1){
						m--;
					}
					if(m==(h2+1)/2){
						flat1=1;
					}	
				}
			case 3:
				int h3=scn.nextInt();
				int o=1;
				int flat2=0;
				int p=(h3-1)/2;
				for(int a2=1;a2<=h3;a2++){
					for(int b2=1;b2<=o;b2++){
					System.out.print(" ");
					}
					for(int b3=1;b3<=0;b3++){
					System.out.println("#");
					}
					if(flat2==0 && o>0){
						o--;
					}
					
				}
			}
		}
	}

}
