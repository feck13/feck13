import java.util.Scanner;

public class Sommatoria {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int N = 0;
		do {
		    System.out.print("> ");
		    N = input.nextInt();
		} while (N <= 0);
		
		int i = 0, s = 0, m = 1;
		while (i <= N) {
			s = s + i;
			if (i != 0) m = m * i;
			i = i + 1;
			System.out.println(i+" "+s+" "+m);
		}
		System.out.println(s+" "+m);
	}
}