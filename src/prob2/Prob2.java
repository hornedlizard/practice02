package prob2;

import java.util.Scanner;

public class Prob2 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner( System.in );
		int intArray[] = new int[5];
		System.out.println( "5개의 숫자를 입력하세요." );
		
		double sum = 0;
		int size = 0;
		
		for (int i = 0; i < intArray.length; i++) {
			intArray[i] = scanner.nextInt();
		}
		
		for (int i = 0; i < intArray.length; i++) {
			sum += intArray[i];			
			size++;
		}
		
		System.out.println("평균은 "+sum/size+"입니다.");
		
		scanner.close();
		
	
	}
}
