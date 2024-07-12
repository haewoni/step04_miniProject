package vendingMachineHero.admin.controller;

import vendingMachineHero.admin.service.UserService;

public class UserController {
	
	private static UserController istance = new UserController();

	// 로그인
	public UserController() {}
	
	public String loginUser(String username) {
		return
				UserService.getService().loginUser(username);
		
	}
	
	
	
}
