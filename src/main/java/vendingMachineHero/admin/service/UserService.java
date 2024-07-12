package vendingMachineHero.admin.service;

import java.util.ArrayList;

import vendingMachineHero.admin.dao.UserDAO;
import vendingMachineHero.model.User;

public class UserService {

	private static UserService instance = new UserService();
	private static UserDAO u = new UserDAO();

	private UserService() {
	}

	public static UserService getService() {
		return instance;
	}

	// 로그인
	public static String loginUser(String username) {
		User user = u.getUser(username);
		if (user != null) {
			System.out.println("환영합니다.");
		} else {
			System.out.println("등록되지 않은 사용자입니다. 입력하신 이름으로 신규 가입합니다.");
			u.saveUser(username);
		}
		return user.getUsername();
	}

	// 모든 유저 검색
	public ArrayList<User> showUsers() {
		return u.showUsers();
	}

	// 특정 유저 검색
	public User getUser(String username) {
		return u.getUser(username);
	}

	// 새로운 유저 저장
	public User saveUser(String username) {
		return u.saveUser(username);
	}

	// 유저 삭제
	public void deleteUser(String username) {
		u.deleteUser(username);
	}

}
