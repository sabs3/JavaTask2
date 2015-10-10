
public class Main {
	
	public static void main(String[] args) {
		PairofDice dice;
		
		dice = new PairofDice();
		
		dice.roll();
		System.out.println(dice.getNameO() + " Came up with number " + dice.getDice1());
		System.out.println(dice.getNameT() + " Came up with number " + dice.getDice2());
		
	}
}
