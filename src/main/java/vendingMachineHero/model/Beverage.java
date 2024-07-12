package vendingMachineHero.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Beverage {
	private String name;        
	private int price;
	private int strength;       
	private int agility;
	private int intelligence;

}
