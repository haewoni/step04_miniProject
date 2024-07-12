package vendingMachineHero.service;

import vendingMachineHero.dao.HeroDAO;
import vendingMachineHero.model.Beverage;
import vendingMachineHero.model.Hero;

public class HeroService {
	public static HeroService instance = new HeroService();

	public Hero getHero() {
		Hero hero = HeroDAO.instance.getHeroInfo();
		return hero;
	}

	public void addBeverage(Beverage beverage) {
		HeroDAO.instance.addBeverage(beverage);
	}
}
