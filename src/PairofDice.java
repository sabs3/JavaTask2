import java.util.Scanner;

public class PairofDice {
	private int dice1;
	private int dice2;
	private String name1;
	private String name2;
	
	public PairofDice() {
		roll();
		name();
	}
	
	public void name() {
		
		Scanner user_input = new Scanner(System.in);
		
		System.out.print("Enter the name player 1: ");
		name1 = user_input.next();
		
		System.out.print("Enter the name player 2: ");
		name2 = user_input.next();
		
	}
	
	public void roll() {
		dice1 = (int)(Math.random()*10) +1;
		dice2 = (int)(Math.random()*10) +1;
	}
	
	public int getDice1() {
		return dice1;
	}
	
	public int getDice2() {
		return dice2;
	}
	
	public String getNameO() {
		return name1;
	}
	
	public String getNameT() {
		return name2;
	}

}
