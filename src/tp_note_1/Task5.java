package tp_note_1;

import java.util.Scanner;

public class Task5 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float usd;
		Scanner S= new Scanner(System.in);
		System.out.println("Input money in Riels: ");
		int riel= S.nextInt();
		usd=(float)riel/4000;
		System.out.println(riel+" RIELS = "+usd+" USD");
		
	}
}
