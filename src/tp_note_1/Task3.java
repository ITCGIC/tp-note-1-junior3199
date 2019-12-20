package tp_note_1;

import java.util.Scanner;

	public class Task3 {
		public static void main(String[] args) {
			// TODO Auto-generated method stub
			int totals;
			Scanner S= new Scanner(System.in);
			System.out.println("Input hour: ");
			int hour=S.nextInt();
			System.out.println("Input minute: ");
			int minute=S.nextInt();
			System.out.println("Input second: ");
			int second=S.nextInt();
			
			totals=(hour*3600)+(minute*60)+second;
			System.out.print("The total seconds is: "+totals+" seconds");
		}
}
