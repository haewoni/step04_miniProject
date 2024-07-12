package vendingMachineHero.dao;

import java.util.ArrayList;
import java.util.Random;

import vendingMachineHero.model.Beverage;

public class BeverageDAO {

	public static BeverageDAO instance = new BeverageDAO();

	private BeverageDAO beverage = new BeverageDAO();

	private BeverageDAO() {
	}

	public static BeverageDAO getInstance() {
		return instance;
	}

	static ArrayList<Beverage> p = new ArrayList<>();

	// beverage 데이터 추가
	static {
		p.add(new Beverage("드래곤 브레스", 1000, 80, 40, 30));
		p.add(new Beverage("엘프의 눈물", 1500, 20, 70, 50));
		p.add(new Beverage("고블린 포션", 3000, 60, 30, 10));
		p.add(new Beverage("트롤 피", 2000, 90, 20, 5));
		p.add(new Beverage("페어리 다스트", 4000, 10, 90, 70));
		p.add(new Beverage("마법사 음료", 4000, 30, 40, 80));
		p.add(new Beverage("전사의 맥주", 2000, 70, 20, 20));
		p.add(new Beverage("빅토리 와인", 3500, 50, 60, 40));
		p.add(new Beverage("엔젤 밀크", 1000, 40, 50, 60));
		p.add(new Beverage("악마의 물", 2500, 100, 10, 10));
	}

	/**
	 * 1. 음료 뽑기 (사용자)
	 * 
	 * @return 뽑은 음료 객체
	 */
	public Beverage getBeverageRandom() {
		Random random = new Random();
		int index = random.nextInt(instance.getSize());
		return getBeverage(index);
	}

	/**
	 * 2. 음료 되팔기 (사용자)
	 * 
	 * @return 되판 음료 객체 or 사용자 남은 음료 리스트
	 	*/

	
	public Beverage getBeverage(int index) {
		if (index >= 0 && index < p.size()) {
			return p.get(index);
		} else {
			return null;
		}
	}

	
	public int getSize() {
		return p.size();
	}

}
