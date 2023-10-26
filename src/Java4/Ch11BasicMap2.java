import java.util.HashMap;
import java.util.Map;

public class Ch11BasicMap2 {

	public static void main(String[] args) {

		// 회원가입 할 때, 3개의 정보를 User클래스에 만든다 (ID, PWD 제외)
		// 모든 정보를 출력하는 메서드 하나, 맵에다가 3명 정도의 회원가입을 시킨다
		// 키보드 입력을 통해 ID와 비번이 일치하면 그 회원의 정보를 모두 출력하시오
		HashMap<String, String> userMap = new HashMap<String, String>();
		userMap.put("psu", "qwer");
		userMap.put("lkj", "asdf");
		userMap.put("lhs", "zxcv");

		System.out.println("ID와 Password를 입력해주세요");
		String id = "psu";
		String pwd = " qwer ".trim();
		System.out.println();

		// String checkId = "";
		if (userMap.get(id).equals(pwd) == true) {
			System.out.println("비밀번호가 일치합니다");
			System.out.println("로그인 되었습니다");
			System.out.println("반갑습니다" + id + "님");
		} else {
			System.out.println("ID 또는 Password가 틀렸습니다");
		}
	}
}