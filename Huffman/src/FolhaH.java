public class FolhaH extends ArvoreH {

	private char valor;

	public FolhaH(int freq) {
		super(freq);
	}

	public FolhaH(int freq, char valor) {
		super(freq);
		this.valor = valor;
	}

	public char getvalor() {
		return valor;
	}

	public void setvalor(char valor) {
		this.valor = valor;
	}
}
