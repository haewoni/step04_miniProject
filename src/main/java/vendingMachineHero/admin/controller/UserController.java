package vendingMachineHero.admin.controller;

import vendingMachineHero.admin.service.UserService;

public class UserController {

	public static UserController istance = new UserController();

	// 로그인
	public UserController() {
	}

	public String loginUser(String username) {
		return UserService.getService().loginUser(username);

	}

	public String getLogginedUser() {
		return UserService.getService().getLogginedUser();
	}

}
