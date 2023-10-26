import java.util.Scanner;

public class Ch4Flow2 {

	public static void main(String[] args) {
		int input = 0;
		int answer = 0;

		Scanner scan = new Scanner(System.in);
		answer = (int) (Math.random() * 20) + 1;
		boolean flag = true;

		while (flag) {
			System.out.print("1과 20 사이의 정수를 입력해주세요: ");
			input = scan.nextInt();

			if (input > answer) {
				System.out.println("더 작은 수로 다시 입력해주세요");
			} else if (input < answer) {
				System.out.println("더 큰 수로 다시 입력해주세요");
			} else {
				flag = false;
			}
			System.out.println("정답을 맞추셨습니다!");
			System.out.println("닙이 입력한 값: " + input);
			System.out.println("정답 값: " + answer);
			System.out.println("다음에 또 이용해주세요.");
		}
	}
}