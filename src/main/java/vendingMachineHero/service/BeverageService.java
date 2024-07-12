package vendingMachineHero.service;

import java.util.ArrayList;

import vendingMachineHero.model.Beverage;

public class BeverageService {
	
	// 싱글톤 디자인 패턴
	public static BeverageService instance = new BeverageService();
	
	// 모든 음료 저장 변수
	private ArrayList<Beverage> beverage = new ArrayList<>();
	
	//생성자
	private BeverageService() {}
	
	// 서비스 객체 직접 접근 x , 외부에서 메소드로 접근 허용
	public static BeverageService getInstance() {
		return instance;
	}

}
