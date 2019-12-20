package tp_note_1;
import java.util.Scanner;
public class Task4 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		float starts, ends,h,mn,s,duration,cost;
		Scanner S= new Scanner(System.in);
		System.out.println("Input start hour: ");
		int sh=S.nextInt();
		System.out.println("Input start minute: ");
		int smn=S.nextInt();
		System.out.println("Input start second: ");
		int ss=S.nextInt();
		System.out.println("Input end hour: ");
		int eh=S.nextInt();
		System.out.println("Input end minute: ");
		int em=S.nextInt();
		System.out.println("Input end second: ");
		int es=S.nextInt();
		
		starts=(sh*3600)+(smn*60)+ss;
		ends=(eh*3600)+(em*60)+es;
		duration=ends-starts;
		h=duration/3600;
		mn=(duration%3600)/60;
		s=duration%60;
	
		System.out.printf("The call duration is: %.0fh:%.0fmn:%.0fs",h,mn,s);
		System.out.printf("\nThe cost is: %.4f $",((duration/60)*0.05) );
	}
}
