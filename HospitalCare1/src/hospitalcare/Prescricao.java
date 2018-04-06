package hospitalcare;
import java.util.ArrayList;
import java.util.Date;

public class Prescricao {
	Date data;
	
	//atributos dos relacionamentos
	protected Doente _doente;
	protected Medico _medico;
	protected Medicamento _medicamento;
	protected ArrayList <HorarioToma> horariosToma;
	
	
	//construtores
	public Prescricao() {
		horariosToma= new ArrayList <HorarioToma>();
	}
	
	public Prescricao(Date data, Doente _doente, Medico _medico, Medicamento _medicamento,
			ArrayList<HorarioToma> horariosToma) {
		super();
		this.data = data;
		this._doente = _doente;
		this._medico = _medico;
		this._medicamento = _medicamento;
		this.horariosToma = horariosToma;
	}

	public Date getData() {
		return data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public Doente get_doente() {
		return _doente;
	}

	public void set_doente(Doente _doente) {
		this._doente = _doente;
	}

	public Medico get_medico() {
		return _medico;
	}

	public void set_medico(Medico _medico) {
		this._medico = _medico;
	}

	public Medicamento get_medicamento() {
		return _medicamento;
	}

	public void set_medicamento(Medicamento _medicamento) {
		this._medicamento = _medicamento;
	}

	public ArrayList<HorarioToma> getHorariosToma() {
		return horariosToma;
	}

	public void setHorariosToma(ArrayList<HorarioToma> horariosToma) {
		this.horariosToma = horariosToma;
	}
	

	
	
}
