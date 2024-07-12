package vendingMachineHero.controller;

import vendingMachineHero.service.BeverageService;
import vendingMachineHero.service.VendingMachineService;
import vendingMachineHero.model.Beverage;
import java.util.Scanner;

public class VendingMachineController {

	private static VendingMachineController instance = new VendingMachineController();
	private static VendingMachineService service = VendingMachineService.getInstance();
	private Scanner scanner = new Scanner(System.in);

	private VendingMachineController() {
	}

	public static VendingMachineController getInstance() {
		return instance;
	}

	/*
	 * 음료 검색 (리스트 출력)
	 */
	public void listBeverages() {
		System.out.println("음료 리스트를 출력합니다.");
		service.listBeverages();
	}

	/*
	 * 음료 추가 및 수정
	 * 
	 */
	// public void addOrUpdateBeverage() {
	// System.out.println("추가 할 음료 이름을 입력해 주세요 : ");
	// String name = scanner.nextLine();
	//
	// System.out.println("음료의 가격을 입력해 주세요 : ");
	// int price = scanner.nextInt();
	// scanner.nextLine();
	//
	// System.out.println("음료의 strength를 입력해 주세요 : ");
	// String strength = scanner.nextLine();
	//
	// System.out.println("음료의 agility를 입력해 주세요 : ");
	// String agility = scanner.nextLine();
	//
	// System.out.println("음료의 intelligence를 입력해 주세요 : ");
	// String intelligence = scanner.nextLine();
	//
	// Beverage existingBeverage = service.searchBeverageByName(name);
	// // 만약 추가할 음료가 리스트에 존재하는 이름값일 경우 업데이트 실행
	// if (existingBeverage != null) {
	// service.updateBeverage(name, price, strength, agility, intelligence);
	// } else {
	// Beverage newBeverage = new Beverage(name, price, strength, agility,
	// intelligence);
	// service.addBeverage(newBeverage);
	// }
	// }

	/*
	 * 음료 삭제
	 * 
	 */
	// public void deleteBeverage() {
	// System.out.println("삭제할 음료를 입력해 주세요. : ");
	// String name = scanner.nextLine();
	// service.deleteBeverage(name);
	// }
	public Beverage getOneBeverage() {
		Beverage beverage = VendingMachineService.getInstance().pickUpBeverage();
		return beverage;
	}
}