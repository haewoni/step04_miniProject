package step04_miniproject;

import vendingMachineHero.admin.dao.UserDAO;

public class Test {

	@org.junit.Test
	public void t1() {
		UserDAO u = new UserDAO();
		u.saveUser("dffdg");
		System.out.println(u.getUser("dffdg"));
		u.getUser("dff22dg");
		u.showUsers();
		u.deleteUser("dffdg");
		u.showUsers();

	}
}
