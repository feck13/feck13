
import java.util.Scanner;

public class AddIntegers {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("Inserisci un intero: ");
		int a = input.nextInt();
		
		System.out.print("Inserisci un altro: ");
		int b = input.nextInt();
		
		int somma = a + b;
		
		System.out.print("La somma è: ");
		System.out.println(somma);
	}
};