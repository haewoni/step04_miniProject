package vendingMachineHero.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import vendingMachineHero.admin.controller.UserController;

public class LoginView {

	public static LoginView instnace = new LoginView();

	public void print() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				util.Terminal.clearScreen();

				System.out.println("*****************************");
				System.out.println("*      로그인     *");
				System.out.println("*****************************");
				System.out.print("유저 이름: ");

				// 사용자 입력 받기
				String username = reader.readLine();
				UserController.istance.loginUser(username);
				VendingMachineView.instance.print();
			} catch (IOException e) {
				System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
			}
		}
	}
}
