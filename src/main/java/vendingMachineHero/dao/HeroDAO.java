package vendingMachineHero.dao;

import java.util.ArrayList;

import vendingMachineHero.model.Beverage;
import vendingMachineHero.model.Hero;

public class HeroDAO {
	public static HeroDAO instance = new HeroDAO();

	private Hero hero;

	private HeroDAO() {
		hero = new Hero();
		hero.setItems(new ArrayList<>());
	}

	public Hero getHeroInfo() {
		return hero;
	}

	//
	public void increaseStat(Beverage beverage) {
		hero.setStrength(beverage.getStrength() + hero.getStrength());
		hero.setAgility(beverage.getAgility() + hero.getAgility());
		hero.setIntelligence(beverage.getIntelligence() + hero.getIntelligence());
	}

	public void addBeverage(Beverage beverage) {
		increaseStat(beverage);

		ArrayList<Beverage> items = hero.getItems();
		items.add(beverage);
		hero.setItems(items);
	}

}
