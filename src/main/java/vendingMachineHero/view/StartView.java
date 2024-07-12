package vendingMachineHero.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StartView {

	public static void main(String[] args) {
		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				util.Terminal.clearScreen();
				// 메뉴 출력
				System.out.println("*****************************");
				System.out.println("*      자판기 히어로      *");
				System.out.println("*****************************");
				System.out.println("* 1. 로그인                   *");
				// System.out.println("* 2. 관리자 로그인 *");
				System.out.println("* 2. 종료       				*");
				System.out.println("*****************************");
				System.out.print("선택하세요: ");

				// 사용자 입력 받기
				String choiceStr = reader.readLine();
				int choice = Integer.parseInt(choiceStr);

				// 선택에 따른 처리
				switch (choice) {
					case 1:
						System.out.println("로그인 선택됨");
						// 로그인 로직 추가
						LoginView.instnace.print();
						break;
					// case 2:
					// System.out.println("관리자 로그인 선택됨");
					// // 관리자 로그인 로직 추가
					// break;
					case 2:
						System.out.println("프로그램을 종료합니다.");
						return; // 프로그램 종료
					default:
						System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
				}
			} catch (IOException e) {
				System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
			}
		}
	}
}
