package vendingMachineHero.admin.dao;

import java.util.ArrayList;

import vendingMachineHero.model.User;

public class UserDAO {
	public static UserDAO instance = new UserDAO();

	private ArrayList<User> users = new ArrayList<>();
	private String logginedUser = "";

	// 모든 유저 검색
	public ArrayList<User> showUsers() {
		return users;
	}

	public void registerLoginUser(String username) {
		this.logginedUser = username;

	}

	public String getLogginedUser() {
		return this.logginedUser;

	}

	// 특정 유저 검색
	public User getUser(String username) {
		for (User u : users) {
			if (u != null && u.getUsername().equals(username)) {
				return u;
			}
		}
		return null;

	}

	// 새로운 유저 저장
	public User saveUser(String username) {
		User u = getUser(username);
		if (u != null) {
			System.out.println("해당 user는 이미 존재합니다.");
			return null;

		} else {
			User newUser = new User(username);
			users.add(newUser);
			System.out.println(newUser.getUsername() + " 생성 완료, 리스트에 저장합니다.");
			return newUser;
		}

	}

	// 유저 삭제
	public void deleteUser(String username) {
		User u = getUser(username);
		if (u != null && users.contains(u)) {
			System.out.println(username + " 유저를 삭제합니다.");
			users.remove(u);
		}

	}
}
