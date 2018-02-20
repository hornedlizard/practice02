package prob1;

public class ChageMachine {
	private int[] mList = {50000, 10000, 5000, 1000, 500, 100, 50, 10, 5, 1};
	private int[] number = new int[10];
	
	public void moneyChange(int money) {
		int remain = money;
		
		for (int i = 0; i < 10; i++) {
			number[i] = remain/mList[i];
			remain = money%mList[i];
		}
		
		for (int i = 0; i < number.length; i++) {
			System.out.println(mList[i]+"원: "+number[i]+"개");
		}
		
	}
	
}
