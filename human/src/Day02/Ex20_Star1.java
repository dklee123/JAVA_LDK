package Day02;

import java.util.Scanner;

public class Ex20_Star1 {
	
	public static void main(String[] args) {
		
		// 자연수 N을 입력받아, 삼각형 모양의 "*"을 출력하시오.
		// 입력 : 5
		// 출력
		// *
		// **
		// ***
		// ****
		// *****
		
		Scanner sc = new Scanner(System.in);
		System.out.print("");
		int N = sc.nextInt();
		
		// N번줄이 나오도록 반복
		// N번째 줄일 때, *이 N번 출력되도록 반복
		for (int i = 1; i <= N; i++) {
			// i : 1, j : 1
			// i : 1, j : 1 2
			// i : 1, j : 1 2 3
			// i : 1, j : 1 2 3 4
			// i : 1, j : 1 2 3 4 5
			for (int j = 1; j <= i; j++) {
				System.out.print("*");	
			}
			System.out.println();
		}
			sc.close();
		
		}
	}

