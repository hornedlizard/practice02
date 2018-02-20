package prob5;

import java.util.Random;
import java.util.Scanner;

public class Prob5 {

	public static void main(String[] args) {
		Random random = new Random();
		int card = random.nextInt(100)+1;
		int guess = 0;
		int count = 1;
		String isContinue;
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.println("수를 결정하였습니다. 맞추어 보세요.");
			System.out.println("1~100");
			while (true) {
				System.out.println(card);
				System.out.print(count+">>");
				guess = sc.nextInt();
				if (guess < card) {
					count++;
					System.out.println("더 높게");
				} else if (guess > card) {
					count++;
					System.out.println("더 낮게");
				} else if (guess==card) {
					System.out.println("맞았습니다.");
					break;
				}
			}
			System.out.print("다시 하시겠습니까?(y/n)>>");
			isContinue = sc.next();
			if (isContinue.equals("n")) {
				break;
			}
		}
	}
}