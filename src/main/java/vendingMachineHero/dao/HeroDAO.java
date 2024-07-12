package vendingMachineHero.dao;

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
}
