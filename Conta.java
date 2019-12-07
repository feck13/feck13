import java.util.Scanner;

public class Conta {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print(">: ");
		int N = input.nextInt();
	 
		int contatore = 0;
		while (contatore <= N) {
			System.out.println(contatore);
		    contatore = contatore + 1;
		}
		
		//System.out.println(contatore);
		
	    }
	}