import java.util.Scanner;

public class Ch4Flow4 {

	public static void main(String[] args) {
		// 변수 선언
		int user = 0;
		int com = 0;

		// 스캐너
		Scanner scan = new Scanner(System.in);

		System.out.println("가위(1), 바위(2), 보(3) 중 하나를 입력하세요");
		// 입력
		user = scan.nextInt();
		// 랜덤
		com = (int) (Math.random() * 3) + 1;

		System.out.println("당신은" + user + "입니다");
		System.out.println("com은" + com + "입니다");

		switch (user - com) {
			case 2:
			case -1:
				System.out.println("당신이 졌습니다");
				break;
			case 1:
			case -2:
				System.out.println("당신이 이겼습니다");
				break;
			case 0:
				System.out.println("당신이 비겼습니다");
				break;
		}
	}
}
