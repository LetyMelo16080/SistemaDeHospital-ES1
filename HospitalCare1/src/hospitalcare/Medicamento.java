package hospitalcare;

public class Medicamento {

	protected Prescricao _prescricao;
	int dosagem;
	String Nome;
	
	public Medicamento() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Medicamento(Prescricao _prescricao, int dosagem, String nome) {
		super();
		this._prescricao = _prescricao;
		this.dosagem = dosagem;
		Nome = nome;
	}

	public Prescricao get_prescricao() {
		return _prescricao;
	}

	public void set_prescricao(Prescricao _prescricao) {
		this._prescricao = _prescricao;
	}

	public int getDosagem() {
		return dosagem;
	}

	public void setDosagem(int dosagem) {
		this.dosagem = dosagem;
	}

	public String getNome() {
		return Nome;
	}

	public void setNome(String nome) {
		Nome = nome;
	}
	
	
}
