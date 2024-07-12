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
	public void updateBeverage(String name, int price, int strength, int agility, int intelligence) {
		for(Beverage beverage : items) {
			if(beverage.getName().equalsIgnoreCase(name)) {
				beverage.setPrice(price);
				beverage.setStrength(strength);
				beverage.setAgility(agility);
				beverage.setIntelligence(intelligence);
				
				return;
			}
		}
		System.out.println("음료가 없습니다.");
	}
	/*
	 * 음료 삭제
	 */
	public void deleteBeverage(String name) {
		Beverage removeBeverage = null;
		for(Beverage beverage : items) {
			if(beverage.getName().equalsIgnoreCase(name)) {
				removeBeverage = beverage;
				break;
			}
		}
		
		if(removeBeverage != null) { // 삭제할 이름이 존재할 경우 삭제
			items.remove(removeBeverage);
			System.out.println(removeBeverage.getName() + "를 삭제하였습니다.");
		} else {
			System.out.println(name + " 라고 하는 음료를 찾지 못했습니다.");
		}
	}
	
	/*
	 * 음료 뽑기 (랜덤)
	 */
	public Beverage pickUpBeverage() {
		Beverage beverage = BeverageDAO.getInstance().getBeverageRandom();
		return beverage;
	}
	
	/*
	 * 음료 검색 (리스트 확인용)
	 */
	
	public Beverage searchBeverageByName(String name) {
		for(Beverage beverage : items) {
			if(beverage.getName().equalsIgnoreCase(name)) {
				return beverage;
			}
		}
		return null;
	}
}
