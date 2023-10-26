import java.util.ArrayList;

public class Ch11BasicArrayList2 {

	public static void main(String[] args) {

		ClassRoom cr = new ClassRoom();
		cr.banName = "API 자바";
		cr.studentCapacity = 16;

		ClassRoom cr2 = new ClassRoom(10, "API 파이썬");

		// 클래스의 정보와 완벽해 진 후에 할 수 있는 것!!!
		ArrayList<ClassRoom> classRoomList = new ArrayList<ClassRoom>();
		classRoomList.add(cr);
		classRoomList.add(cr2);

		// get(0)는 객체에 접근하는 느낌!!!
		classRoomList.get(0).info();
		classRoomList.get(0).banName = "Open API Java";
		classRoomList.get(0).info();

		ClassRoom myTempInstanceVar = null;
		myTempInstanceVar = classRoomList.get(1);
		myTempInstanceVar.info();
	}
}