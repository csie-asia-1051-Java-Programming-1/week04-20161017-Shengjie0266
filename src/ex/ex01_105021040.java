package ex;
/*
 * Topic: 寫一個程式讓使多個正整數(包含0)直到使用者輸入-1 時停止，同時要顯示這些數字 總合 及 平均。
 * Date: 2016/10/17
 * Author: 105021040 洪聖傑
 */
import java.util.Scanner;

public class ex01_105021040 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);
		int a = 0 ,b = 0;
		int tol = 0;
		while(a != -1){
			a=scn.nextInt();
			tol += a;
			b += 1;
		}
		System.out.println("總和是:" + (tol+1));
		System.out.println("平均是:" + (float)(tol+1)/(float)(b-1));
	}

}
