public class NoH extends ArvoreH {

	private ArvoreH direita;
	private ArvoreH esquerda;

	public NoH(ArvoreH direita, ArvoreH esquerda) {
		super(direita.getfrequencia() + esquerda.getfrequencia());
		this.direita = direita;
		this.esquerda = esquerda;
	}

	public ArvoreH getdireita() {
		return direita;
	}

	public void setdireita(ArvoreH direita) {
		this.direita = direita;
	}

	public ArvoreH getesquerda() {
		return esquerda;
	}

	public void setesquerda(ArvoreH esquerda) {
		this.esquerda = esquerda;
	}
}
