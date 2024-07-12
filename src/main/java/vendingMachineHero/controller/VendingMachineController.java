package vendingMachineHero.controller;

public class VendingMachineController{
	
	private static VendingMachineController instance = new VendingMachineController();
		
	public static VendingMachineController getInstance() {
		return instance;
	}
	private VendingMachineController() {}
	
}