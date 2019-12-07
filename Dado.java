
public class Dado {
	
	public static int tiradado()
	{
		return (int)(6*Math.random() +1);
			
		}
	
	public static void main(String[] args) {
		
        int[] contatori = new int[13];
		
		for (int i=0; i<1000000; i++) {
			int tiro1 = tiradado();
			int tiro2 = tiradado();
			int somma = tiro1 + tiro2;
			contatori[somma]++;
		}
		for (int i=2; i<13; i++) {
			int p = (int)(100*contatori[i]/1000000.0);
			System.out.printf("%2d - %2d - ",i,p);
	        for (int j=0; j<p; j++) {
				 System.out.print("#");
		}
			 System.out.println("");
	}
	}
};
	