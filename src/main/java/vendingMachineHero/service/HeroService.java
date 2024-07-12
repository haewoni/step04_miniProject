package vendingMachineHero.service;

import vendingMachineHero.dao.HeroDAO;
import vendingMachineHero.model.Hero;

public class HeroService {
	public static HeroService instance = new HeroService();

	public Hero getHero() {
		Hero hero = HeroDAO.instance.getHeroInfo();
		return hero;
	}
}
