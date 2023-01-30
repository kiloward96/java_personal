package java_personal.tt;

import java.util.Scanner;

public class test_230130 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int amount = sc.nextInt();
		int [][] array = new int [100][100];
		
		
		int x = sc.nextInt();
		int y = sc.nextInt();
		
		int [][] square = new int [x][y];
		
		
		System.out.println("사각형 갯수: " + amount);
		int xSide = x + 10;
		int ySide = y + 10;
		System.out.println(x + "test2:" + xSide);
		System.out.println(y + "test3:" + ySide);
		
	}

}
