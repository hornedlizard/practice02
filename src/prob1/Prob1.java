package prob1;

import java.util.Scanner;

public class Prob1 {
	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );		
		System.out.print( "금액:" );
		int money = scanner.nextInt();
		
		ChageMachine cm = new ChageMachine();
		cm.moneyChange(money);
		
		scanner.close();
 	}
}