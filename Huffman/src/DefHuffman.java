import java.util.PriorityQueue;
import java.io.PrintWriter;



public class DefHuffman {

	public ArvoreH buildarvore(int[] contador){
		
		PriorityQueue<ArvoreH> fila = new PriorityQueue<>();
		
		// pelo conceito que entendi de huffman , essa lista de prioridade é essencial para a continuação , acabei achando essa biblioteca para facilitar as construções;
		
		for(int i=0;i<contador.length;i++){
			if( contador[i] > 0 ){
				fila.add(new FolhaH(contador[i], (char) i));
			}
		}
		
		while( fila.size() > 1 ){
			
			ArvoreH arvore1 = fila.poll();
			ArvoreH arvore2 = fila.poll();
			
			fila.add(new NoH(arvore1,arvore2));
			
		}
		
		return fila.poll();
	}
	
	public void Imprime(ArvoreH arvore, StringBuilder aux, PrintWriter bw) throws Exception  {
		
		if( arvore instanceof FolhaH ){
			FolhaH folha = (FolhaH) arvore;
			// imprimindo no console já que a gravação no arquivo não deu certo.
			System.out.println(folha.getvalor()+"\t" +folha.getfrequencia()+"\t"+aux);

			// professor , aqui tento fazer a gravação no arquivo, busquei alguns meios alternativos , mas nenhum deles obtive sucesso, me comprometo a continuar tentado buscar a solução pontual aqui.
			bw.printf((folha.getvalor()+"\t" +folha.getfrequencia()+"\t"+aux).toString()); 
			
			
		}else if( arvore instanceof NoH ){
			
			NoH node = (NoH) arvore;
			
			// essa resolução via append, confesso também que foi via códigos auxiliares, quebrei a cabeça com a navegação entre os lados das árvores, e essa solução resolveu.
			aux.append("0");
			Imprime(node.getesquerda(),aux,bw);
			aux.deleteCharAt(aux.length()-1);
			

			aux.append("1");
			Imprime(node.getdireita(),aux,bw);
			aux.deleteCharAt(aux.length()-1);		
			
		}		
	}
}
