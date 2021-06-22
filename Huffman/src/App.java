  
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.PrintWriter;


public class App {

	public static void main(String[] args) throws Exception  {
	
     		
        FileReader fr = new FileReader(System.getProperty("user.dir") + "\\dados.txt");
        BufferedReader br = new BufferedReader(fr);
        String line = br.readLine();

	 	int[] Vcont = new int[256];
		
		for(char c : line.toCharArray()){
			++Vcont[c];
    	}

		
		DefHuffman huffmanCode = new DefHuffman();
		
		ArvoreH huffmanarvore = huffmanCode.buildarvore(Vcont);

        // Essa parte ainda não consegui acertar.

        FileWriter fw = new FileWriter(System.getProperty("user.dir") + "\\saida.txt");
        PrintWriter bw = new PrintWriter(fw);

        
        huffmanCode.Imprime(huffmanarvore, new StringBuilder(),bw);

        br.close();
        fr.close();




	}
}
