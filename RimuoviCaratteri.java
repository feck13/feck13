import java.io.*;

public class RimuoviCaratteri {
    public static void main(String [] args) throws IOException {

        BufferedReader filebuf = 
             new BufferedReader(new FileReader("Alice.txt"));

        String nextStr;
        nextStr = filebuf.readLine();     
        while (nextStr != null){
            System.out.println(nextStr);   
            nextStr = filebuf.readLine(); 
        } 
        filebuf.close();  
        System.out.println("\nBye bye!");
    }
}
