package Day05;

import java.util.Scanner;

public class Ex04_Matrix {

	public static void main(String[] args) {
		// 양의 정수 M과 N을 입력받아 저장하고,
		// M행 N열의 2차원 배열을 생성한다.
		// 각 요소의 값을 입력받고, 그대로 출력하시오.
		// (입력예시)
		// M : 2
		// N : 3
		// 1 2 3
		// 4 5 6
		// (출력예시)
		// 1 2 3
		// 4 5 6	
		Scanner sc = new Scanner(System.in);
		int M, N, X, Y;
		System.out.print("M : ");
		M = sc.nextInt();
		System.out.print("N : ");
		N = sc.nextInt();
		
		// M행 N열의 2차원 배열 선언 및 생성
		int arr[][] = new int[M][N];
		
		// 2차원배열은 이중반복문으로 접근한다.
		// 바깥 반복문 	- 반복변수 i : 행 접근
		// 안 반복문 		- 반복변수 j : 행 접근
		// arr.length				: 행 크기
		// arr[i].length			: 열 크기
		// 입력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		
		// 출력
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
		
		// 위와 같이, X행Y열 2차원 배열을 생성하고,
		// 순서대로 값을 입력받아 그대로 출력해보세요.
		// (단, 출력 시 foreach 문을 사용)
		X = sc.nextInt();
		System.out.print("X : ");
		Y = sc.nextInt();
		System.out.print("Y : ");
		
		int arr2[][] = new int[X][Y];
		// 입력
		for (int i = 0; i < arr2.length; i++) {
			for (int j = 0; j < arr2[i].length; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		// 출력(foreach)
		for (int[] row : arr2) {
			
			for (int col : row) {
				System.out.print(col + " ");
			}
			System.out.println();
		}
		
		sc.close();
	}		
		
}










