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
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("음료명 : ");
		builder.append(name);
		builder.append(", 가격 : ");
		builder.append(price);
		builder.append(", 힘 : ");
		builder.append(strength);
		builder.append(", 민첩성 : ");
		builder.append(agility);
		builder.append(", 지능 : ");
		builder.append(intelligence);
		return builder.toString();
	}
}
