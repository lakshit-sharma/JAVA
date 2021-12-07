import java.util.Scanner;

public class CalculateSpeed {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Input distance in meters: ");
		double distance = sc.nextDouble();
		
		System.out.println("Input hour: ");
		double hour = sc.nextDouble();
		
		System.out.println("Input minutes: ");
		double minutes = sc.nextDouble();
		
		System.out.println("Input seconds: ");
		double seconds = sc.nextDouble();
		
		double hourToSeconds= hour*60*60;
		double minToSec = minutes*60;
		double time = seconds + hourToSeconds + minToSec;
		
		double speed = distance / time;
		double speed1 = distance*(18/5) / time;

		
		System.out.println("Your speed in meters/second is "+ speed);
		System.out.println("Your speed in km/h is "+ speed1);
		System.out.println("Your speed in miles/h is ");
		
		sc.close();
	}

}
