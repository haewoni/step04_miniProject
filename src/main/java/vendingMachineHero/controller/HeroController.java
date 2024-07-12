package vendingMachineHero.controller;

import vendingMachineHero.model.Hero;
import vendingMachineHero.service.HeroService;

public class HeroController {
	public static HeroController instance = new HeroController();
	
	public Hero getHeroInfo() {
		Hero hero =HeroService.instance.getHero();
		return hero;
	}
}
