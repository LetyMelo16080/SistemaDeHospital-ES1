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
	

	
	
}
