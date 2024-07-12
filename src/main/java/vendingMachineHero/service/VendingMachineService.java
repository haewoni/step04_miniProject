package vendingMachineHero.service;

import vendingMachineHero.dao.BeverageDAO;
import vendingMachineHero.model.Beverage;
import java.util.ArrayList;
import java.util.List;

public class VendingMachineService {
	
	private static VendingMachineService instance = new VendingMachineService();
	
	private ArrayList<Beverage> items = new ArrayList<Beverage>();
	
	private VendingMachineService() {}
	
	public static VendingMachineService getInstance() {
		return instance;
	}
	
	/*
	 *  등록된 음료 출력
	 */
	public void listBeverages() {
		if(items.isEmpty()) {
			System.out.println("등록되어 있는 음료가 존재하지 않습니다.");
		} else {
			for(Beverage beverage:items) {
				System.out.println(beverage);
			}
		}
	}
	
	/*
	 * 음료 수정 (추가)
	 * 
	 */
	
	public void addBeverage(Beverage beverage) {
		items.add(beverage);
		System.out.println("추가된 음료 이름은 " +beverage+ "입니다.");
		
	}
	/*
	 * 음료 수정 (수정) 
	 * 
	 */
	
	/*
	 * 음료 뽑기 (랜덤)
	 */
	
	public Beverage pickUpBeverage() {
		Beverage beverage = BeverageDAO.getInstance().getBeverageRandom();
		return beverage;
	}
}
