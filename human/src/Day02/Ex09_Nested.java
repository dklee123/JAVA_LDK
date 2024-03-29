package Day02;

import java.util.Scanner;

public class Ex09_Nested {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// 정보처리기사 자격증 합격기준
		// 4학년, 60점이상 - 합격
		System.out.print("점수 입력 : ");
		int score = sc.nextInt();
		
		System.out.print("학년(1~4) : ");
		int year = sc.nextInt();

		// 중첩 if 문은 권장하지 않는다.
		if(year == 4) {
			if(score >= 60) {
				System.out.println("합격!");
			} else {
				System.out.println("불합격!");
			}
		}
		else {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		
		// 중첩하지 않고 조건을 줄 수 있다.
		// 조건1) 합격!
		// : 4학년이면서 점수가 60점 이상
		if(year == 4 && score >= 60) {
			System.out.println("합격!");
		}
		
		// 조건2) 불합격!
		// : 4학년이면서 점수가 60점 미만
		if(year == 4 && score < 60) {
			System.out.println("불합격!");
		}
		
		// 조건3) 응시자격 없음
		// : 4학년이 아닌 경우
		if(year != 4) {
			System.out.println("응시 자격요건에 해당되지 않습니다.");
		}
		
		sc.close();
	}

}
