package vendingMachineHero.dao;

import java.util.ArrayList;

import vendingMachineHero.model.Beverage;
import vendingMachineHero.model.Hero;

public class HeroDAO {
	public static HeroDAO instance = new HeroDAO();

	private Hero hero;

	private HeroDAO() {
		hero = new Hero();
	}

	public Hero getHeroInfo() {
		return hero;
	}

	public void addBeverage(Beverage beverage) {
		ArrayList<Beverage> items = hero.getItems();
		items.add(beverage);
		hero.setItems(items);
	}

}
