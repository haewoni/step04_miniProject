package step04_miniproject;

import java.util.ArrayList;

import vendingMachineHero.admin.dao.UserDAO;
import vendingMachineHero.model.User;

public class Test {

	@org.junit.Test
	public void t1() {
		UserDAO u = new UserDAO();
		u.saveUser("1");
		u.saveUser("2");
		u.saveUser("3");
		ArrayList<User> soo = u.showUsers();
		for (User i : soo) {
			System.out.println(i.getUsername());
		}

		System.out.println(u.getUser("1").getUsername());
		u.deleteUser("2");
		ArrayList<User> soo1 = u.showUsers();
		for (User i : soo1) {
			System.out.println(i.getUsername());
		}

	}
}

/*
 * # 학습 내용
 * 깃 다루기
 * mvc패턴
 * 테스트 코드 작성(선택사항)
 */