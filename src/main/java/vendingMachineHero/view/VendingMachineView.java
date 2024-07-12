package vendingMachineHero.view;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import vendingMachineHero.controller.HeroController;
import vendingMachineHero.model.Beverage;
import vendingMachineHero.model.Hero;

public class VendingMachineView {
	public static VendingMachineView instance = new VendingMachineView();
	private int choice = 0;

	public void print() {

		BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

		while (true) {
			try {
				util.Terminal.clearScreen();

				System.out.println("*****************************");
				System.out.println("*      자판기 뽑기     *");
				System.out.println("*****************************");
				System.out.println("* 1. 자판기 뽑기                 *");
				System.out.println("* 2. 히어로 스탯          *");
				System.out.println("* 3. 종료                   *");
				System.out.println("*****************************");

				if (choice != 0) {
					switch (choice) {
						case 1:
							break;
						case 2:
							printHeroStat();
							break;
						case 3:
							System.out.println("프로그램을 종료합니다.");
							System.exit(0);
							return;
						default:
							System.out.println("잘못된 선택입니다. 다시 선택해주세요.");
					}
				}

				// 사용자 입력 받기
				String choiceStr = reader.readLine();
				choice = Integer.parseInt(choiceStr);
			} catch (IOException e) {
				System.out.println("입력 오류가 발생했습니다. 다시 시도해주세요.");
				choice = 0;
			} catch (NumberFormatException e) {
				System.out.println("잘못된 입력입니다. 숫자를 입력해주세요.");
				choice = 0;
			}
		}
	}

	private void pickUpBeverage() {

	}

	private void printHeroStat() {
		Hero hero = HeroController.instance.getHeroInfo();
		System.out.println("*****************************");
		System.out.println("*      히어로 스탯     *");
		System.out.println("*****************************");
		System.out.println("* 이름: " + hero.getUsername());
		System.out.println("* 힘: " + hero.getStrength());
		System.out.println("* 민첩: " + hero.getAgility());
		System.out.println("* 지능: " + hero.getIntelligence());
		System.out.println("*****************************");
		System.out.println("*      뽑은 음료들     *");
		System.out.println("*****************************");
		for (Beverage item : hero.getItems()) {
			System.out.println(
					item.getName() + " " + item.getStrength() + " " + item.getAgility() + " " + item.getIntelligence());
		}
	}
}
