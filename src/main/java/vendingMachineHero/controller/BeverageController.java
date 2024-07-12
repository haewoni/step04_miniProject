package vendingMachineHero.controller;

import vendingMachineHero.service.BeverageService;

public class BeverageController {

	private static BeverageController instance = new BeverageController();
	private static BeverageService	service = BeverageService.getInstance();
	
	private BeverageController() {}
	
	public static BeverageController getInstance() {
		return instance;
	}
	
	/**
	 * 
	 * 1 . 모든 음료 검색 (관리자)
	 * 
	 * @return 모든 Beverage
	 */
	/**
	 * 
	 * 1-2 . 음료 추가 (관리자)
	 * 
	 * @return 모든 Beverage
	 */
	
	
	/**
	 * 2. 음료 뽑기 (사용자)
	 * 
	 * @return 
	 */
	
	
	/**
	 * 2-1. 음료 되팔기 (사용자)
	 * 
	 * @return 
	 */

}
