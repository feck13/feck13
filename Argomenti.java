
public class Argomenti {
	public static void main(String[] args) {
		System.out.println("argomenti da");
		
		System.out.println("linea di comando");
		System.out.println("Numero Argomenti: "+args.length);
		for (int i=0; i<args.length; i++)
			System.out.println("args[" + i + "] = \"" + args[i] + "\"");
	}
};