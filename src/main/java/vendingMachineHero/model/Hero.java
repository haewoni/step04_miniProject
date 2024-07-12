package vendingMachineHero.model;

import java.util.ArrayList;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hero {
	private String username;
	private int strength;
	private int agility;
	private int intelligence;
	private ArrayList<Beverage> items;
}
