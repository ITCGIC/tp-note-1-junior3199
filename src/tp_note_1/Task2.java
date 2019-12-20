package tp_note_1;
import java.util.Scanner;
public class Task2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int h,mn,s;
		Scanner S= new Scanner(System.in);
		System.out.println("Input number of second: ");
		int second=S.nextInt();
		h=(second/3600);
		mn=(second%3600)/60;
		s=second%60;
		System.out.print(+h+":"+mn+":"+s);
	}

}
