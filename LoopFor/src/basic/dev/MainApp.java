package basic.dev;

import java.util.Scanner;

public class MainApp {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

//		12.1
//		int tong = 0;
//		for(int i = 0 ; i <= 100 ; i++) {
//			tong +=i;
//
//		}
//		System.out.println("Tổng từ 1 đến 100 :"+ tong);

//		12.2

//		System.out.println("nhập số tự nhiên n");
//		int n = sc.nextInt();
//		System.out.println("các số chia hết cho 3 bé hơn n là :");
//		for(int i =0; i < n ; i++ ) {
//			if(i%3 !=0 ) {
//				continue;
//			}
//			System.out.println(i);
//		}

		// 12.3

//		System.out.println("100 số đầu tiên của dãy Fibonacci :");
//		int fn = 0;
//		int f1 = 1;
//		int f2 = 1;
//		System.out.println(f1);
//		System.out.println(f2);
//		for (int i = 3; i < 100; i++) {
//			fn = f1 + f2;
//			System.out.println(fn);
//			f1 = f2;
//			f2 = fn;
//			i++;
//		}

		// 12.4
//		int num1, num2, reversed = 0;
//		System.out.println("nhập n : ");
//		num1 = sc.nextInt();
//		num2 = num1;
//		for (; num1 != 0; num1 /= 10) {
//			int digit = num1 % 10;
//			reversed = reversed * 10 + digit;
//		}
//		System.out.printf("Số %d sau khi đảo ngược là: %d", num2, reversed);
//		if (reversed == num2) {
//			System.out.println(" là số polinom");
//
//		} else {
//			System.out.println("không phải số polinom");
//		}

		// 12.5

		int a = 100;
		int b = 999;
		for (int i = a; i < b; i++) {
			if (i % 3 == 0) {
				System.out.println(i + " ");

			}
		}
	}

}
