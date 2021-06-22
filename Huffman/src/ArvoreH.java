public class ArvoreH implements Comparable<ArvoreH> {

	private int frequencia;

	public ArvoreH(int frequencia) {
		this.frequencia = frequencia;
	}

	public int getfrequencia() {
		return frequencia;
	}

	public void setfrequencia(int frequencia) {
		this.frequencia = frequencia;
	}

	@Override // professor , aqui confesso ter pego parte do cód do professor Marcos Costa Supra, para prevenir um erro.... Entendi a lógica antes de implementar esta parte.
	public int compareTo(ArvoreH Asecundaria) {
		return Integer.compare(this.frequencia, Asecundaria.getfrequencia());
	}
}
